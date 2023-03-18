import java.util.*;

class Quicksort {
    static void display(String a[]) {
        for (String name : a) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static int partition(String a[], int lb, int ub) {
        String pivot = a[ub];
        int i = lb - 1;
        for (int j = lb; j < ub; j++) {
            if (a[j].compareToIgnoreCase(pivot) < 0) {
                i++;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        String x = a[i];
        a[i] = pivot;
        a[ub] = x;
        return i;
    }

    public static void sort(String a[], int lb, int ub) {
        if (lb < ub) {
            int pindex = partition(a, lb, ub);
            sort(a, lb, pindex - 1);
            sort(a, pindex + 1, ub);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of list");
        int n = s.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name");
            a[i] = s.next();
        }
        System.out.println("The list before sort:");
        display(a);
        sort(a, 0, n - 1);
        System.out.println("After sort:");
        display(a);
    }
}
import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class main {
    public static void main(String arg[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student number:");
        int n = sc.nextInt();
        Student st[] = new Student[n];
        String name;
        int age;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the name");
            name = sc.next();
            System.out.println("enter the age");
            age = sc.nextInt();
            st[i] = new Student(name, age);

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (st[j + 1].age < st[j].age) {
                    int temp1 = st[j].age;
                    st[j].age = st[j + 1].age;
                    st[j + 1].age = temp1;
                    String temp2 = st[j].name;
                    st[j].name = st[j + 1].name;
                    st[j + 1].name = temp2;
                }

            }

        }
        PrintWriter fw = new PrintWriter("detail.txt");
        for (int i = 0; i < n; i++) {
            fw.println("name:" + st[i].name + "\tage:" + st[i].age);
        }
        fw.flush();
        fw.close();
    }

}
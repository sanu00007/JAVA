import java.io.*;
import java.util.*;

class letter {
    public static void main(String arg[]) throws Exception {
        try {
            int array[] = new int[100];
            int i = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number as string:");
            String a = s.nextLine();
            int b = Integer.parseInt(a);
            while (b != 0) {
                array[i] = b % 10;
                b = b / 10;
                System.out.print(array[i]);
                i++;
            }

        } catch (Exception e) {
            System.out.println("enetered number contain non digit");
        }
    }

}
package Maths;

public class Maths_operations {
    public static void max(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("the max is" + x);
        } else if (y > z) {
            System.out.println("the max is" + y);
        } else {
            System.out.println("the max is" + z);
        }
    }
}

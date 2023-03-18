package Maths;

public class Maths_operations {
    public static void maxmin(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("the max is" + x);
        } else if (y > z) {
            System.out.println("the max is" + y);
        } else {
            System.out.println("the max is" + z);
        }
    }
}

/*
 * class Result {
 * public static void main(String arg[]) {
 * Maths_operations M = new Maths_operations(5, 8, 6);
 * M.maxmin();
 * }
 * }
 */

import java.io.*;

class file12 {
    public static void main(String arg[]) throws Exception {
        /*
         * File f = new File("abc.txt");
         * FileWriter A = new FileWriter("abc.txt");
         * A.write(100);
         * A.write("100");
         * A.flush();
         * A.close();
         */

        PrintWriter B = new PrintWriter("abc.txt");
        B.println("100");
        B.println(100);
        B.flush();
        B.close();

    }

}
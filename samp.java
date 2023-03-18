import java.util.*;
import java.io.*;

class samp {
    public static void main(String arg[]) throws Exception {
        try {
            Scanner Sc = new Scanner(System.in);
            String f1 = Sc.next();
            BufferedReader br = new BufferedReader(new FileReader(f1));

        } catch (Exception e) {
            System.out.println("no file");
        }
        System.out.println("kooi");
    }
}
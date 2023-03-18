import java.io.*;
import java.util.*;

class File {
    public static void main(String arg[]) throws Exception {
        int x, sum = 0;
        InputStreamReader S = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(S);
        System.out.println("enter the number");
        String i = br.readLine();
        StringTokenizer st = new StringTokenizer(i, " ");
        while (st.hasMoreTokens()) {
            x = Integer.parseInt(st.nextToken());
            System.out.println(x);
            sum += x;

        }
        System.out.println(sum);
    }

}
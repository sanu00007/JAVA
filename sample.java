import java.io.*;

class file22 {
    public static void main(String arg[]) throws Exception {
        PrintWriter pw1 = new PrintWriter("neeru.txt");
        pw1.println(100);
        pw1.println(200);
        pw1.println("okay");
        pw1.flush();
        pw1.close();

        BufferedReader br = new BufferedReader(new FileReader("neeru.txt"));
        PrintWriter p = new PrintWriter("var.txt");
        String i = br.readLine();
        while (i != null) {
            p.println(i);
            i = br.readLine();
            p.flush();
        }

    }
}
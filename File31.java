import java.io.*;
//import util.io.*;

class File {
    public static void main(String arg[]) throws Exception {
        int x = 0;
        BufferedReader Br = new BufferedReader(new FileReader("sanu.txt"));
        PrintWriter Pr = new PrintWriter("sanu number.txt");
        String l1 = Br.readLine();
        while (l1 != null) {
            Pr.print(++x + ":");
            Pr.println(l1);
            l1 = Br.readLine();
            Pr.flush();
        }
        Br.close();
        Pr.close();

    }
}
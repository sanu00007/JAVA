import java.io.*;

class File {
    public static void main(String arg[]) throws Exception {
        BufferedWriter Br = new BufferedWriter(new FileWriter("sanu.txt"));
        Br.write("name is sanin");
        Br.newLine();
        Br.write("age is 21");
        Br.newLine();
        Br.write("dad is abdul azeez and mom is shareena m k");
        Br.flush();
        Br.close();
    }

}
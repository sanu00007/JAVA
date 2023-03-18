import java.io.*;

class main {
    static int count, line;

    public static void main(String arg[]) throws Exception {

        FileWriter fw = new FileWriter("text.txt");
        fw.write(60);
        fw.write("\n");
        fw.write("String checking mahn\n");
        fw.write('a');
        fw.flush();
        fw.close();
        FileReader fr = new FileReader("text.txt");
        int i = fr.read();

        while ((i) != -1) {
            if (i == 10) {
                System.out.print("\n");
            }
            System.out.print((char) i);

            i = fr.read();
        }

        char a[] = new char[10];
        fr.read(a);
        for (char c : a) {
            System.out.println(c);
        }
        fr.close();
    }

}
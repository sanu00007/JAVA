import java.io.*;

public class file {
    private static boolean createNewFile;

    public static void main(String arg[]) throws IOException {
        File f1 = new File("FILE");
        f1.mkdir();
        File f2 = new File(f1, "abc.txt");
        f2.createNewFile();

    }

}
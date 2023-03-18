import java.io.*;

class File {
    public static void main(String arg[]) throws Exception {
        int character = 0, line = 0, word = 0;
        BufferedReader Br = new BufferedReader(new FileReader("sanu.txt"));
        String l1 = Br.readLine();
        while (l1 != null) {
            character = l1.length() + character;
            line++;
            String S[] = l1.split(" ");
            word = word + S.length;
            l1 = Br.readLine();
        }
        System.out.println("number of line is=" + line);
        System.out.println("number of letters is=" + character + "\nwords is=" + word);
        Br.close();
    }
}
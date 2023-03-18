import java.util.*;

class main {
    public static void main(String arg[]) throws Exception {
        String str = "am sanin my name is good but am bad and i love cristiano but my family is first so please be quiet";
        String str2 = "a";
        StringTokenizer st = new StringTokenizer(str, str2);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
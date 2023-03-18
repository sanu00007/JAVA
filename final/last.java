import java.util.*;

class main {
    public static void main(String arg[]) throws Exception {
        List<Integer> l = new Vector<Integer>();
        l.add(5);
        l.add(3);
        l.add(7);
        System.out.println(l);
        Collections.sort(l);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
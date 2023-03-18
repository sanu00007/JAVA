import java.util.*;

class list {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<String> l = new LinkedList<String>();
        l.add("FOOTBALL");
        l.add("CRICKET");
        l.add("TENNIS");
        l.add("BASKET BALL");
        l.add("WRESTLING");
        System.out.println("List of sports " + l);
        System.out.println("Enter element from sports to delete");
        String a = s.next();
        if (l.contains(a)) {
            l.remove(a);
        } else {
            System.out.println("element does not exist");
        }
        System.out.println("list of sports after deletion");
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
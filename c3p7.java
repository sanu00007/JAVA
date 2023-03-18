interface P {
    double P = 5.6;

    void PC();
}

interface P1 extends P {
    double P1 = 2.56;

    void PC1();

}

class Q implements P, P1 {

    public void PC() {
        System.out.println(P);

    }

    public void PC1() {
        System.out.println(P1);
    }
}

class Final {
    /**
     *
     */
    static Q q = new Q();

    public static void main(String arg[]) {

        q.PC();
        q.PC1();
    }
}

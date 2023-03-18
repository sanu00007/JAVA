protected class check {
    int a;

    check(int a) {
        this.a = a;
    }
}

class B extends check {
    int b;

    B(int a, int b) {
        super(a);
        this.b = b;
    }

}

class main {
    public static void main(String[] args) {
        B b = new B(12, 120);
        System.out.println(b.a);
    }

}
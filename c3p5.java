interface Area {
    void area();

    double PI = 3.14;
}

interface volume {
    void volume();
}

abstract class Shape {
    abstract void getname();
}

class circle extends Shape implements Area {
    int r;
    String N;

    circle(int r, String N) {
        this.r = r;
        this.N = N;
    }

    public void area() {
        double area = PI * (r * r);
        System.out.println("\nthe area is " + area);
    }

    void getname() {
        System.out.println("\nthe name of the shape is " + N);
    }

}

class cylinder extends circle implements volume {
    int h;

    cylinder(int r, String N, int h) {
        super(r, N);
        this.h = h;
    }

    public void volume() {
        double volume;
        volume = PI * (r * r) * h;
        System.out.println("\nvolume is= " + volume);
    }

    void getname() {
        System.out.println("\nthe name of the shape is=" + N);
    }
}

class Result {
    public static void main(String arg[]) {
        cylinder A = new cylinder(5, "cylinder", 10);
        circle B = new circle(4, "circle");
        A.getname();
        A.volume();
        B.getname();
        B.area();

    }

}
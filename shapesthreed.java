
interface area {
    double r = 10;

    void dimension();
}

interface volume {
    double h = 20;
}

abstract class Shape {
    String N;
    double area, volume;

    Shape(String N) {
        this.N = N;
    }

    abstract void getName();

}

class Circle extends Shape implements area {
    int r;

    Circle( nt r) {
     
    this.r=r;

    
        

    }

    void getName() {
        System.out.println("name of shape is" + N);
    }

    public void dimension() {
        area = 3.14 * r;
        System.out.println("area is" + area);
    }

}

class Cylinder extends Circle implements volume {
    int h;

    Cylinder(String N, int r, int h) {
        super(N, r);
        this.h = h;
    }

    void getName() {
        System.out.println("name of shape is" + N);
    }

    public void dimension() {
        area = 2 * 3.14 * r * (h + r);
        volume = 3.14 * r * r * h;
        System.out.println("area is" + area);
        System.out.println("volume is" + volume);
    }
}

class Final {
    public static void main(String arg[])

    {
        Circle A = new Circle(5);
        Cylinder B = new Cylinder("Cyclinder", 10, 5);

        A.getName();
        A.dimension();
        B.getName();
        B.dimension();

    }

}

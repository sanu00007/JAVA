interface Operations {
    double PI = 3.14;

    void Area();

    void Volume();

}

class Cylinder implements Operations {
    int height, radius;

    Cylinder(int h, int r) {
        height = h;
        radius = r;
    }

    public void Area() {
        double area;
        area = 2 * PI * radius * (radius + height);
        System.out.println("the area of cylinder is=" + area);
    }

    public void Volume() {
        double volume;
        volume = PI * Math.sqrt(radius) * height;
        System.out.println("the volume of the cylinder is" + volume);

    }
}

class Decider {
    public static void main(String arg[]) {
        Cylinder C1 = new Cylinder(5, 10);
        C1.Area();
        C1.Volume();

    }
}
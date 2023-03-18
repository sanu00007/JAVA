package Stack;

class Stack_operations {
    int x, y, z;
    double avg;

    Stack_operations(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

   public static void avg() {
        avg = (x + y + z) / 3.0;
        System.out.println("the average is" + avg);
    }
}

/*class Result {
    public static void main(String arg[]) {
        Stack_operations S = new Stack_operations(5, 10, 15);
        S.avg();
    }

}
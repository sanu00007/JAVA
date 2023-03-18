import java.io.*;
import java.util.Random;

class ronaldo extends Thread {
    public void run() {
        Random obj = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                int num = obj.nextInt(25);
                if (num % 2 == 0) {
                    Square s = new Square(num);
                    s.start();

                } else {
                    Cube c = new Cube(num);
                    c.start();

                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Square extends Thread {
    int num;

    Square(int num) {
        this.num = num;

    }

    public void run() {
        System.out.println("thread square:" + num + " square:" + num * num);

    }

}

class Cube extends Thread {
    int num;

    Cube(int y) {
        this.num = num;

    }

    public void run() {
        System.out.println("thread cube:" + num + " cube:" + num * num * num);

    }

}

class main {
    public static void main(String arg[]) {
        ronaldo r = new ronaldo();
        r.start();

    }
}

class even extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i += 2) {
                even.sleep(500);
                System.out.println("thread even:" + i);

            }
        } catch (Exception obj) {
            System.out.println(obj);
        }
    }

}

class odd extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                odd.sleep(1000);
                System.out.println("thread odd:" + i);

            }
        } catch (Exception obj) {
            System.out.println(obj);
        }
    }

}

class main {
    public static void main(String arg[]) {
        even e = new even();
        odd o = new odd();
        e.start();
        o.start();
    }
}
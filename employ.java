class employ {
    int salary;

    employ() {
        salary = 10000;
    }

    void display() {
        System.out.println("class is employ");
    }

    void calcSalary() {
        System.out.println("salary is" + salary);
    }
}

class engineer extends employ {

    engineer() {

        salary = 20000;
    }

    void display() {
        System.out.println("class is engineer");
    }

}

class Demo {
    public static void main(String arg[]) {
        employ E = new employ();
        E.display();
        E.calcSalary();
        engineer e = new engineer();
        e.display();
        e.calcSalary();

    }

}

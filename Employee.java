class Employee 
{
    String name;
    int age;
    long phone_number;
    String address;
    int salary;

    Employee(String name, int age, long phone_number, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    void printsalary() {
        System.out.println("salary is" + salary);
    }

}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, long phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }

}

class Manager extends Employee {
    String department;

    Manager(String name, int age, long phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

}

class Demo {
    public static void main(String[] args) {
        Officer obj1 = new Officer("ronaldo", 37, 8848, "portugal", 1000000, "goat");
        Manager obj2 = new Manager("messi", 35, 8848, "argentina", 20000, "football");
        obj1.printsalary();
        obj2.printsalary();
        System.out.println(obj1.name + obj1.age);
    }

}

package Abstractia;

abstract class Employee {
    String name;
    String lastname;
    int age;
    int salary;

    Employee(String name, String lastname, int age, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    abstract void work();

    abstract void DrinkCoffe();

    abstract void getDetails();

    void ShowSalary() {
        System.out.println("Employee : " + this.name + " " + this.lastname + "are salariu : " + this.salary);
    }
}

class Manager extends Employee {
    Manager(String name, String lastname, int age, int salary) {
        super(name, lastname, age, salary);
    }

    @Override
    void work() {
        System.out.println(name + " " + "se ocupa de coordonarea echipei");

    }

    @Override
    void DrinkCoffe() {
        System.out.println(name + " " + lastname + " " + "Nu bea cafea");
    }

    @Override
    void getDetails() {
        System.out.println("Managerul : " + name + " " + lastname + " are " + age + " ani " + "salariul este de: " + salary);

    }


}

class Programator extends Employee {
    Programator(String name, String lastname, int age, int salary) {
        super(name, lastname, age, salary);
    }

    @Override
    void work() {
        System.out.println(name + " " + "Programatorul descrie activitatea de programare");
    }

    @Override
    void DrinkCoffe() {
        System.out.println(name + " " + lastname + " Bea cafea fara zahar");
    }

    @Override
    void getDetails() {
        System.out.println("Programistul " + name + " " + lastname + " are " + age + " ani " + "salariul este de: " + salary);

    }


}

class Vanzator extends Employee {
    Vanzator(String name, String lastname, int age, int salary) {
        super(name, lastname, age, salary);
    }

    @Override
    void work() {
        System.out.println(name + " " + "vinzatorul descrie activitatea de vinzare");
    }

    @Override
    void DrinkCoffe() {
        System.out.println(name + " " + lastname + " Bea cafea fara zahar");
    }

    @Override
    void getDetails() {
        System.out.println("Vinzatorul " + name + " " + lastname + " are " + age + " ani " + "salariul este de: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Petru", "Popa", 20, 3000),
                new Programator("Gigel", "Patron", 25, 2500),
                new Vanzator("Svetlana", "Popa ", 22, 2000)
        };
        for (Employee employee : employees) {
            employee.getDetails();
            employee.work();
            employee.DrinkCoffe();
            employee.ShowSalary();
            System.out.println("---------------------------");
        }

    }

}

package mpj;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary before hike: " + salary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        double hike = salary * 0.50;
        salary = salary + hike;
        System.out.println("Salary after 50% hike: " + salary);
    }
}

class InternEmployee extends Employee {

    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        double hike = salary * 0.25;
        salary = salary + hike;
        System.out.println("Salary after 25% hike: " + salary);
    }
}

public class MPJ02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Employee Type (F for Full Time / I for Intern): ");
            char type = sc.next().charAt(0);

            System.out.println();

            if (type == 'F' || type == 'f') {
                FullTimeEmployee f = new FullTimeEmployee(name, salary);
                f.displaySalary();
                f.calculateSalary();
            } 
            else if (type == 'I' || type == 'i') {
                InternEmployee i = new InternEmployee(name, salary);
                i.displaySalary();
                i.calculateSalary();
            } 
            else {
                System.out.println("Invalid Employee Type");
            }

            System.out.println();
            System.out.print("Do you want to add another employee? (Y/N): ");
            choice = sc.next().charAt(0);
            System.out.println();

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}

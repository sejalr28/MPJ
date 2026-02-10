class Employee {
   protected double salary;


   Employee(double salary) {
       this.salary = salary;
   }


   void displaySalary() {
       System.out.println("Salary: " + salary);
   }
}



class FullTimeEmployee extends Employee {


   FullTimeEmployee(double salary) {
       super(salary);
   }


   void calculateSalary() {
       System.out.println("Full Time Employee");
       System.out.println("Salary before hike:");
       displaySalary();


       salary = salary + (salary * 0.50); // 50% 


       System.out.println("Salary after 50% hike:");
       displaySalary();
       System.out.println();
   }
}


// Derived class 2
class InternEmployee extends Employee {


   InternEmployee(double salary) {
       super(salary);
   }


   void calculateSalary() {
       System.out.println("Intern Employee");
       System.out.println("Salary before hike:");
       displaySalary();


       salary = salary + (salary * 0.25); // 25% 


       System.out.println("Salary after 25% hike:");
       displaySalary();
       System.out.println();
   }
}



public class ASS2 {
   public static void main(String[] args) {


       FullTimeEmployee fte = new FullTimeEmployee(40000);
       InternEmployee intern = new InternEmployee(20000);


       fte.calculateSalary();
       intern.calculateSalary();
   }
}

package first;


import java.util.Scanner;


public class ASS1 {


 
   String name;
   int rollNo;
   float[] marks = new float[5];
   float total, average;
   char grade;


   public ASS1() {
       Scanner sc = new Scanner(System.in);


       System.out.print("Enter student name: ");
       name = sc.nextLine();


       System.out.print("Enter roll number: ");
       rollNo = sc.nextInt();


       System.out.println("Enter marks of 5 subjects:");
       for (int i = 0; i < 5; i++) {
           marks[i] = sc.nextFloat();
           total += marks[i];
       }


       calculateResult();
       sc.close();
   }


  
   public void calculateResult() {
       average = total / 5;


       if (average >= 90)
           grade = 'A';
       else if (average >= 80)
           grade = 'B';
       else if (average >= 70)
           grade = 'C';
       else if (average >= 60)
           grade = 'D';
       else
           grade = 'E';


       display();
   }


  
   public void display() {
       System.out.println("\n--- Student Result ---");
       System.out.println("Name      : " + name);
       System.out.println("Roll No   : " + rollNo);
       System.out.println("Total     : " + total);
       System.out.println("Average   : " + average);
       System.out.println("Grade     : " + grade);
   }


   public static void main(String[] args) {
       new ASS1();
   }
}

import java.util.Scanner;

public class project1 {
    public static void main(String[] args){

        int passmarks = 41;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name:");
        String name = scanner.nextLine(); //1st step




        System.out.println("Enter Your marks:");
        int marks = scanner.nextInt(); //2nd step

        System.out.println("---------------------------------------------");
        System.out.println("Hello " + name + "!");
        System.out.println("As we know!" );
        System.out.println("The passing marks for this exam is above 40");
        System.out.println("And you can get scholership!");
        System.out.println("If you have marks 90 or above");
        System.out.println("So good luck " + name);
        System.out.println("---------------------------------------------");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");



        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
            return; //if input is wrong
        }

        scanner.nextLine();

        System.out.println("---------------------------------------------");
        //grade starts here
        String grade;

        if (marks >= 90) {
            System.out.println("Grade:  A");
            grade = "A";

        } else if (marks >= 80) {
            System.out.println("Grade: B");
            grade = "B";
        } else if (marks >= 70) {
            System.out.println("Grade: C");
            grade = "C";
        } else if (marks >= 60) {
            System.out.println("Grade: D");
            grade = "D";
        } else if (marks >= 50) {
            System.out.println("Grade: E");
            grade = "E";
        } else if (marks >= 40) {
            System.out.println("Grade: F");
            grade = "F";
        } else{
            grade = "F";
        }
        System.out.println("---------------------------------------------");
//result starts here
        String result;
        if(marks < passmarks){
            System.out.println("Result: FAIL");
            result = "FAIL";

        } else {
            System.out.println("Result: PASS");
            result = "PASS";
        }
        System.out.println("---------------------------------------------");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();

        System.out.println("---------------------------------------------");
// Eligible section starts here
        String criteria;
        if (marks >= 90){
            System.out.println("Scholarship Status: Eligible");
            criteria = "Eligible";
        } else{
            System.out.println("You did not got the scholarship!");
            System.out.println("Better luck next time.");
            criteria = "Not Eligible";
        }
        System.out.println("---------------------------------------------");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("      STUDENT REPORT");
        System.out.println("--------------------------");
        System.out.println("--------------------------");

        System.out.println("Name: " + name);
        System.out.println("Marks: "+ marks);
        System.out.println("Grade: "+ grade );
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + criteria );

        System.out.println("--------------------------");
        System.out.println("--------------------------");
        scanner.close();

    }
}

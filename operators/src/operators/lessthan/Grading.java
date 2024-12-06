package operators.lessthan;

import java.util.Scanner;

//Determine if a score is below a passing grade.
/* Pseudo-code
 req. 2 variables grades & passing grades
 accept grade
 passing grades
 if else statement
 print the alert
 */
//public class Grading {
//    public static void main(String[] args) {
//        Scanner g = new Scanner(System.in);
//        System.out.println("Enter your Grades: ");
//        int grades = g.nextInt();
//        int passing_g = 60;
//        if (grades < passing_g){
//            System.out.println("improve your grades");
//        }
//        else {
//            System.out.println("Best luck your grades are okay");
//        }
//    }
//}
public class Grading {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in); // Create a Scanner object

        // Prompt user to input grades
        System.out.println("Enter your Grades: ");
        int grades = g.nextInt(); // Read the grades as an integer

        // Check and print the grade based on conditions
        if (grades >= 90) {
            System.out.println("Grade: A");
        } else if (grades >= 75) {
            System.out.println("Grade: B");
        } else if (grades >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F (You need to improve your grades)");
        }

        g.close();
    }
}

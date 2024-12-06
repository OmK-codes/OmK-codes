package operators.lessthan;

import java.util.Scanner;

// Check if a user is too young to access specific content
// Accept the age from user
// check age with if else statement
// return message
public class AgeRestriction {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        System.out.println("Enter your Age :- ");
        int age = s.nextInt();
        if ( age < 18) {
            System.out.println("Restricted Content");
        }
        else {
            System.out.println("You can continue Watching");
        }
        s.close();
    }

}

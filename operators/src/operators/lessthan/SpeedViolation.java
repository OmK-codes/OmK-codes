package operators.lessthan;

import java.util.Scanner;

//Detect if a vehicle's speed is below the minimum limit for a highway.
public class SpeedViolation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Speed Of the Vehicle :- ");
        int speed = s.nextInt();
        int limit = 80;
        if (speed < 80){
            System.out.println("Within Speed");
        }
        else {
            System.out.println("Please reduce your Speed below 80");
        }
        s.close();
    }
}

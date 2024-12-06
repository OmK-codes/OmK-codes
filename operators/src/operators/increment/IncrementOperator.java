package operators.increment;

import java.util.Scanner;

public class IncrementOperator {
    public static void main(String[] args) {
        //accept one value from user and print no + 1
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println("Entered value : " + no);
        // System.out.println("Incremented value : " + (no+1));
        no++; // another way
        System.out.println("Incremented value : " + no);
    }
}

package operators.lessthan;
/*
 Alert if inventory falls below a minimum threshold.
 Pseudo-code
 req. 2 variables sales & threshold
 accept sales count
 threshold count
 if else statement
 print the alert
*/


import java.util.Scanner;

public class StockMonitoring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no units sold :");
        int sold = s.nextInt();

        int threshold = 100;
        if (sold < 100){
            System.out.println("Please restock units");
        }
        else {
            System.out.println("Inventory is okay");
        }

        s.close();

    }
}

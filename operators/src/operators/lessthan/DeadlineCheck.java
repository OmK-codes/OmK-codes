package operators.lessthan;

import java.time.LocalDate;
import java.util.Scanner;

//Verify if a project completion date is before the due date.
/* accept the date
store actual deadline date
check it with if else
print the message
 */
public class DeadlineCheck {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter your Submission date dd-mm-yyyy :- ");
        LocalDate date = LocalDate.parse(d.nextLine());
        LocalDate.of(2024, 12, 1);

    }
}

package operators.greaterthan;
import java.util.Scanner;

// Check if the number of participants in an event exceeds the required number.
public class AttendanceCheck {
    public static void main(String[] args) {
        int requiredParticipants = 20;

        Scanner s = new Scanner(System.in);

        // Ask the user to input the number of participants
        System.out.print("Enter the number of participants: ");
        int actualParticipants = s.nextInt();

        if (actualParticipants > requiredParticipants) {
            System.out.println("Attendance requirement met. The event can proceed.");
        } else {
            System.out.println("Attendance requirement not met. Increase the number of participants.");
        }
        s.close();
    }
}

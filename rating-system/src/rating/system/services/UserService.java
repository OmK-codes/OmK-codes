package rating.system.services;

import rating.system.model.User;

import java.util.Scanner;

public class UserService {

    public User acceptUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your ID :");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please Enter your First Name :");
        String firstname = scanner.nextLine();
        System.out.println("Please Enter your Last Name :");
        String lastname = scanner.nextLine();

        User user = new User();
        user.id = id;
        user.firstname = firstname;
        user.lastname = lastname;


        return user;
    }

}

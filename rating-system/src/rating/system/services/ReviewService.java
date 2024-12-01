package rating.system.services;

import rating.system.model.Product;
import rating.system.model.Review;

import java.util.Scanner;

public class ReviewService {
        public Review acceptReviewData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your Product ID");
            //int id = scanner.nextInt();
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Please Enter your review heading Name");
            String heading = scanner.nextLine();
            System.out.println("Please Enter your review description");
            String description = scanner.nextLine();
            System.out.println("Please Enter Rating");
            int rating = Integer.parseInt(scanner.nextLine());


            // initialize entities
            Review review = new Review();
            review.id = id;
            review.heading = heading;
            review.description = description;
            review.rating = rating;
            return review;
        }
}

package rating.system;

import rating.system.model.Product;
import rating.system.model.Review;
import rating.system.model.User;
import rating.system.services.ProductService;
import rating.system.services.ReviewService;
import rating.system.services.UserService;

public class ReviewServiceDemo {
    public static void main(String[] args) {
        System.out.println("** E-Commerce Review System **");

        UserService userService = new UserService();
        User user = userService.acceptUserInput();

        ProductService productService = new ProductService();
        Product product = productService.acceptProductData();

        ReviewService reviewService = new ReviewService();
        Review review = reviewService.acceptReviewData();


        System.out.println("User Details Are Captured" + user);
        System.out.println("Product Details :" + product);
        System.out.println("Rating Details :" + review);
    }
}
// in this code we have returned the all accepted data to the last before
// the accepted data was directly displayed after accepting
// in this code we have returned the data from service class and catch in this class,
// where we have put the class name in place of void (it will return accepted
// data and will catch that data in ReviewServiceDemo ref. line no 15, 18, 21)
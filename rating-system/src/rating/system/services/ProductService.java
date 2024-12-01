package rating.system.services;

import rating.system.model.Product;

import java.util.Scanner;

public class ProductService {
    public Product acceptProductData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Product ID");
        //int id = scanner.nextInt();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please Enter your Product Name");
        String name = scanner.nextLine();
        System.out.println("Please Enter your Product Price");
        double price = scanner.nextDouble();

        // initialize entities
        Product product = new Product();
        product.id = id;
        product.name = name;
        product.price = price;
        return product;



    }

}

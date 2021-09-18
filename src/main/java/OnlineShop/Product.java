package OnlineShop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int Id;
    private int price;
    private String review;

    /**
     * justReview returneaza doar review-ul produselor!
     */

    public static void justReview(Product product) {
        System.out.println(product.review);
    }
}

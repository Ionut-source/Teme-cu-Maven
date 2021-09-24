package OnlineShop;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class ProductUtils {

    public static ArrayList<Product> getProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, 100, "good"));
        products.add(new Product(2, 200, "nice"));
        products.add(new Product(3, 300, "awesome"));
        products.add(new Product(4, 400, "the best"));
        return products;
    }
}

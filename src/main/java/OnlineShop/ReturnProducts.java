package OnlineShop;

import java.util.ArrayList;

@FunctionalInterface
public interface ReturnProducts {
    Product returnProducts (int id, int price);
    ArrayList<Product> returnProducts = new ArrayList<>();


}
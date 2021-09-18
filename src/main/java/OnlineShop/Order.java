package OnlineShop;

import OnlineShopExceptions.InvalidProductIdException;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {

    private UserAccount userAccount;
    private List<Order> orders;
    private ArrayList<Product> products;
    private int orderNumber;
    private String orderDescription;
    private int orderValue;
    private boolean isDelivered;
    private boolean isReturned;

    public void addOrder() throws InvalidProductIdException {
    }
}
package OnlineShop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAccount{

    public UserAccount() {
    }

    private String name;
    private String email;
    private String password;
//    private OnlineShop.UserAdress userAdress;
//    private ArrayList<OnlineShop.Order> orders;
//    private ArrayList<OnlineShop.Wishlist>wishlists;
}

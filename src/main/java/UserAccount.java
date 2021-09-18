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
//    private ArrayList<Order> orders;
//    private ArrayList<Wishlist>wishlists;
}

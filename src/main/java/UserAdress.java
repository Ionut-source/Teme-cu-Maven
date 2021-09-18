import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class UserAdress {

    private String City;
    private String Street;
    private Integer PostalCode;
   // private ArrayList<UserAdress> userAdresses;
}




package OnlineShop;

import java.util.*;

public class UserAccountUsage {

    public static void main(String[] args) {

        try {
            TreeSet<UserAccount> UserAccountSet = new TreeSet<>(Comparator.comparing(UserAccount::getEmail));

            UserAccountSet.add(new UserAccount("John", "John@icloud.com", "123et4"));
            UserAccountSet.add(new UserAccount("Diana", "diana@gmail.com", "345346uu"));
            UserAccountSet.add(new UserAccount("Melanie", "melanie@yahoo.com", "7575me"));
            UserAccountSet.parallelStream().forEach(System.out::println);

            ArrayList<Product> products = ProductUtils.getProduct();
            System.out.println("\t" + products);
            products.forEach(Product::justReview);


            ArrayList<UserAddress> userAddresses = new ArrayList<>();
            UserAddress John = new UserAddress("Bucuresti", "Victoriei", 6545641);
            UserAddress Diana = new UserAddress("Bihor", "Fabricii", 1471818);
            UserAddress Melanie = new UserAddress("Brasov", "Fericirii", 5454654);
            System.out.println("\tOrasul pt John este: " + John.getCity());
            System.out.format("Este lista de utilizatori goala? %b\n", UserAccountSet.isEmpty());


            IntSummaryStatistics statistics = new IntSummaryStatistics();
            for (Product product : ProductUtils.getProduct()) {
                int price = product.getPrice();
                statistics.accept(price);
            }
            System.out.println("\t" + statistics);

            HashMap<Integer, Product> wishlist = new HashMap<>();
            wishlist.put(1, products.get(1));
            wishlist.put(2, products.get(3));
            System.out.println("Produsele din wishlist: ");


            for (Map.Entry<Integer, Product> entry : wishlist.entrySet()) {
                System.out.println("\t" + entry.getKey() + " -> " + entry.getValue());
            }
        } catch (Exception ex) {
            System.out.println("A aparut o exceptie! " + ex.getMessage());
            ex.printStackTrace();

        }
    }
}
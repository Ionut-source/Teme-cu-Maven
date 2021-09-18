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

            UserAdress CiprianStanciu = new UserAdress("Bucharest", "Victoriei", 6545641);
            UserAdress CosminLobont = new UserAdress("Bihor", "Fabricii", 654650);
            ArrayList<UserAdress> userAdresses = new ArrayList<>(Arrays.asList(CiprianStanciu, CosminLobont));
            System.out.println("\tOrasul pt userul Ciprian Stanciu este: " + CiprianStanciu.getCity());
            System.out.format("Este lista de adrese goala? %b\n", userAdresses.isEmpty());

            IntSummaryStatistics statistics = ProductUtils.getProduct()
                    .stream()
                    .mapToInt(Product::getPrice)
                    .summaryStatistics();
            System.out.println("\t" + statistics);

            HashMap<Integer, Product> wishlist = new HashMap<>();
            wishlist.put(1, products.get(1));
            wishlist.put(2, products.get(3));
            System.out.println("Entry-urile din wishlist: ");

            for (Map.Entry<Integer, Product> entry : wishlist.entrySet()) {
                System.out.println("\t" + entry.getKey() + " -> " + entry.getValue());
            }
        } catch (Exception ex) {
            System.out.println("A aparut o exceptie! " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
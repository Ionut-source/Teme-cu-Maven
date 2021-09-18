package OnlineShop;

import java.util.ArrayList;

public class Wishlist {



    Product product = new Product(10, 515151, "good");
    Product product2 = new Product(100, 64545, "very good");
    ArrayList<Product> products = getProducts();
    ArrayList<Wishlist> wishlists = getWishlists();


    public void setWishlists(ArrayList<Wishlist> wishlists) {
        this.wishlists = wishlists;
    }

    public ArrayList<Wishlist> getWishlists() {
        return wishlists;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}


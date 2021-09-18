

import java.util.ArrayList;
import java.util.Objects;

public class Order {

    private int orderNumber;
    private String orderDescription;
    private int orderValue;
    private ArrayList<Product>products;

    public Order(int orderNumber, String orderDescription, int orderValue) {

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNumber=" + orderNumber +
                ", orderDescription='" + orderDescription + '\'' +
                ", orderValue=" + orderValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && orderValue == order.orderValue && orderDescription.equals(order.orderDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, orderDescription, orderValue);
    }
}
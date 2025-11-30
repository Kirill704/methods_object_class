import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket = new Product[2];

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return customer + " заказ: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order otherOrder = (Order) obj;
        return Objects.equals(customer, otherOrder.customer) && Arrays.equals(basket, otherOrder.basket);

    }
}

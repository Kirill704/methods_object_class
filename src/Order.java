import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

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
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order otherOrder = (Order) obj;
        if (!Objects.equals(customer, otherOrder.customer)) {
            return false;
        }
        if (basket.length != otherOrder.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null && otherOrder.basket[i] == null) {
                return true;
            }
            if (basket[i] == null || otherOrder.basket[i] == null) {
                return false;
            }
            if (!Objects.equals(basket[i], otherOrder.basket[i])) {
                return false;
            }
        }
        return true;
    }
}
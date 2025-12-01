import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(123, "эспандер", 800, "спорт");
        Product product2 = new Product(321, "саксофон", 20000, "музыка");
        Product product3 = new Product(123, "эспандер", 700, "спорт");
        Product product4 = new Product(852, "скрипка", 30000, "музыка");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product1.equals(product2));
        System.out.println(product1.toString());
        System.out.println(product3.toString());
        System.out.println(product1.equals(product3));
        System.out.println(product2.toString());
        System.out.println(product4.toString());
        System.out.println(product2.equals(product4));
        Product[] basket;
        Order order1 = new Order("B.Clinton", basket = new Product[]{product2, product3});
        Order order2 = new Order("S.Holmes", basket = new Product[]{product4, product1});
        Order order3 = new Order("B.Clinton", basket = new Product[]{product2, product1});
        Order order4 = new Order("B.Clinton", basket = new Product[]{product2, product1, product4});
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order1.equals(order2));
        System.out.println(order1.toString());
        System.out.println(order3.toString());
        System.out.println(order1.equals(order3));
        System.out.println(order3.toString());
        System.out.println(order4.toString());
        System.out.println(order4.equals(order3));

    }
}
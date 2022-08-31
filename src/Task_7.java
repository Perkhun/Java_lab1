import java.util.List;

public class Task_7 {
    public static void main(String[] args) {
        Product product = new Product("milk", 52);
        CheckOfProduct product1 = new CheckOfProduct(product, 2);
        System.out.println(product1);

        Product product2 = new Product("lemon", 10);
        CheckOfProduct product_2 = new CheckOfProduct(product2, 5);
        System.out.println(product_2);

        CheckOfProducts checkOfProducts = new CheckOfProducts(List.of(
                new CheckOfProduct(new Product("milk", 52), 2),
                new CheckOfProduct(new Product("lemon", 10), 5)
        ));
        System.out.println("Total price:  " + checkOfProducts.totalPrice());
    }
}


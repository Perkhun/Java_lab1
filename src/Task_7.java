import java.util.List;

public class Task_7 {
    public static void main(String[] args) {
        Product product = new Product("молоко", 52);
        CheckOfProduct product1 = new CheckOfProduct(product, 2);
        System.out.println("Продукт №1:  " + product.getNameOfProduct() + "  " + product.getPrice() + " грн    "
                + product1.getCount());
        System.out.println(product1.calc(product, 2) + " грн");

        Product product2 = new Product("лемон", 10);
        CheckOfProduct product_2 = new CheckOfProduct(product2, 5);
        System.out.println("Продукт №2:  " + product2.getNameOfProduct() + "  " + product2.getPrice() + " грн    "
                + product_2.getCount());
        System.out.println(product_2.calc(product2, 5) + " грн");

        CheckOfProducts checkOfProducts = new CheckOfProducts(List.of(
                new CheckOfProduct(new Product("молоко", 52), 2),
                new CheckOfProduct(new Product("лемон", 10), 5)
        ));
        System.out.println("Всього:  " + checkOfProducts.finalSuma());

    }
}


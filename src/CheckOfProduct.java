public class CheckOfProduct {
    private Product product;
    private int count;

    public CheckOfProduct(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int calc(Product product, int count) {
        return count * product.getPrice();
    }
}

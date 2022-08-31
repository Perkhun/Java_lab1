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

    public int calc()
    {
        return count * product.getPrice();
    }

    @Override
    public String toString() {
        return " name: " + getProduct().getNameOfProduct() +
                System.lineSeparator() +" price: " + getProduct().getPrice() +
                System.lineSeparator() +
                " count=" + getCount() +
                System.lineSeparator() + " " +
                calc() + " UAH" + System.lineSeparator();
    }
}

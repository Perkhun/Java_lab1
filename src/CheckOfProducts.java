import java.util.List;

public class CheckOfProducts {
    private List<CheckOfProduct> listCheckOfProduct;

    public CheckOfProducts(List<CheckOfProduct> listCheckOfProduct) {
        this.listCheckOfProduct = listCheckOfProduct;
    }

    public List<CheckOfProduct> getListCheckOfProduct() {
        return listCheckOfProduct;
    }

    public void setListCheckOfProduct(List<CheckOfProduct> listCheckOfProduct) {
        this.listCheckOfProduct = listCheckOfProduct;
    }
     public int totalPrice() {
       int sum = 0;
       for (CheckOfProduct checkOfProduct : listCheckOfProduct) {
           sum += checkOfProduct.calc();
       }
       return sum;
    }
}

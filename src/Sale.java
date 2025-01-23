import java.util.List;

public class Sale {
    private double totalPrice;
    private List<Product> productCollection;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setProductCollection(List<Product> productCollection) {
        this.productCollection = productCollection;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProductCollection() {
        return productCollection;
    }

    public Sale(List<Product> productCollection) { //En el Arraylist se pone solo LIST sino da error, este
                                                  //contructor no necesita el precio total
        this.productCollection = productCollection;
    }

    public void calculateTotal() throws EmptySaleException {
        if (productCollection.isEmpty()) { // es igual a .size == 0
            throw new EmptySaleException("To make a sale you must first add products.");
        } else {
            totalPrice = 0;
            for (int i = 0; i < productCollection.size(); i++) {
                totalPrice += productCollection.get(i).getPrice();
            }
        }
    }
}

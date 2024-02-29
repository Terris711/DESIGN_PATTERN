package PaymentSystem.model;

public class Product {
    private int price;
    private String upcCode;

    public Product(int price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }
}

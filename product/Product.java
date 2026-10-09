package product;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Product getMostExpensive(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice()) {
            return p1;
        }
        return p2;
    }
}

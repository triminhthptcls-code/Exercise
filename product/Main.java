package product;

public class Main {
    public static void main(String[] args) {
        Product st1 = new Product("tri", 3000);
        Product st2 = new Product("hoa", 5000);
        Product expensive = st1.getMostExpensive(st1, st2);
        System.out.println(expensive.getName());
        System.out.println(expensive.getPrice());
    }
}

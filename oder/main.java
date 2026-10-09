package oder;

public class main {
    public static void Main(String[] args) {
        Oder st1 = new Oder();
        st1.setOder("ND1237", 1000000);
        System.out.println(st1.getTotalAmount());
        st1.applyDiscount(st1, 0.15);
        System.out.println(st1.getTotalAmount());
    }

}

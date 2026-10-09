package oder;

public class Oder {
    private String oderID;
    private double totalAmount;

    public void setOder(String iD, double amount) {
        this.oderID = iD;
        this.totalAmount = amount;
    }

    public String getOderId() {
        return this.oderID;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void applyDiscount(Oder oder, double discountPercent) {
        oder.totalAmount = oder.getTotalAmount() - oder.totalAmount * discountPercent;
    }
}

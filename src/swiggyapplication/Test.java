package swiggyapplication;

public class Test {
    public static void main(String[] args) {
        SwiggyOrder sbiPayment=new SBIPayments();
            sbiPayment.order(new Product(2,1,2));
            sbiPayment.payment(20000,7890);
    }
}

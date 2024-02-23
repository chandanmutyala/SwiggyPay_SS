package swiggyInterface;

public class SwiggyOrderTest {
    public static void main(String[] args) {
        SwiggyOrder swiggyOrder=new SBIPaymentService();
        swiggyOrder.OrderItems(new items(2,4));
        swiggyOrder.payment(12345,9944);


    }
}

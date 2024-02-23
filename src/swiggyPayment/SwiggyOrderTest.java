package swiggyPayment;

public class SwiggyOrderTest {
    public static void main(String[] args) {
        SwiggyOrder swiggyOrder=new SBIPaymentProcessing();
        swiggyOrder.OrderItems(new OrderItems(5,6,9));
        swiggyOrder.payment(3456789,1234);


    }
}

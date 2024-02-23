package swigyApplication;

public class Test {
    public static void main(String[] args) {
        SwigyOrderService sbiPayment= new SbiPaymentService();
        sbiPayment.orderPrice(new Products(2,0,1,0));
        sbiPayment.payment(123,1234);
    }
}

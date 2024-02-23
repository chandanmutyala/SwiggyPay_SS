package swiggy;

public class SwiggyTest {
    public static void main(String[] args) {
        SwiggyOrder sbi=new SbiPaymentsService();
        sbi.order(new SwiggyItems(2,4,6,3));
        sbi.payments(345678,123456);

    }
}

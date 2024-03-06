package swiggyLite;

public class SwiggyTest {
    public static void main(String[] args) {
        PaytmService paytmService = new PaytmService();
        //Login login = new Login();

        FoodItems foodItems = new FoodItems(2,1,4,0);
        OrderProcess orderProcess = new OrderProcess();
        orderProcess.orderProcess(foodItems);
        try {
            paytmService.paymentProcess(156780856,123456);
        } catch (InsufficientAmountException e) {
            throw new RuntimeException(e.getCode());
        }


    }
}

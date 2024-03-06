package swiggy.model;

import swiggy.SbiBankService;
import swiggy.SwiggyOrderProcess;

public class SwiggyTest {
    public static void main(String[] args) {
        DeliveryVendor deliveryVendor = new DeliveryVendor();
        Order order = new Order(500,50,20);
        SbiBankService sbiBankService = new SbiBankService();

        deliveryVendor.delivery(order);
    }
}

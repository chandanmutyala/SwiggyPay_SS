package swiggy.model;

import swiggy.SbiBankService;
import swiggy.SwiggyOrderProcess;
import swiggy.SwiggyPaymentService;

public class DeliveryVendor extends SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
    SbiBankService sbiBankService;
    private double vendorAmount = 1000;

//    public DeliveryVendor(SwiggyPaymentService swiggyPaymentService) {
//        super(swiggyPaymentService);
//    }

    @Override
    public boolean delivery(Order order) {
        if (order.getDeliveryStatus()){
            System.out.println("ORDER DELIVERED SUCCESSFULLY");
            return true;
        }else {
            vendorAmount = vendorAmount - order.getPrice();
           // SbiBankService sbiBankService = new SbiBankService();
            sbiBankService.setMarchantAmount(sbiBankService.getMarchantAmount()+order.getPrice());
        }

        return false;
    }
}

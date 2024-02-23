package swigyApplication;

public abstract class SwigyOrderService implements SwigyPaymentService{
    int totalPrice;
    int chickenBiryaniPrice=150;
    int fishBiryaniPrice=200;
    int localMerchantId=1234;
    public int  orderPrice(Products products){
        totalPrice=products.getChickenBiryani()*chickenBiryaniPrice+products.getFishBiryani()*fishBiryaniPrice;
        return totalPrice;
    }
}

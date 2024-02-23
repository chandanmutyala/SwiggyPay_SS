package swiggyPayment;

public abstract class SwiggyOrder implements SwiggyInterface{
    private int eggNoodles=150;
    private int eggFideRice=250;
    private int chickenBiryani=500;
    public int totalCost;
    int localMerchantId=1234;
    public int OrderItems(OrderItems orderItems){

        totalCost = orderItems.getEggNoodles()*eggNoodles+
                orderItems.getEggFideRice()*eggFideRice+orderItems.getChickenBiryani()*chickenBiryani;
        return totalCost;
    }

    @Override
    public String toString() {
        return "SwiggyOrder{" +
                "eggNoodles=" + eggNoodles +
                ", eggFideRice=" + eggFideRice +
                ", chickenBiryani=" + chickenBiryani +
                ", totalCost=" + totalCost +
                '}';
    }
}

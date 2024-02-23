package swiggyPayment;

public abstract class SwiggyOrder implements SwiggyInterface{
    private  int eggNoodles=120;

    private int eggFideRice=150;

    private int chickenBiryani=140;
    public int totalCost;

    public int OrderItem(OrderItems orderItems){
        totalCost=orderItems.getEggNoodles()*eggNoodles+
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

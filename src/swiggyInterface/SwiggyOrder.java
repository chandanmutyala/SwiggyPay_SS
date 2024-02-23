package swiggyInterface;

public abstract class SwiggyOrder implements SwiggyApplactionService {
    private int chickenfry=200;
    private int chickenNoodles=300;
    public int localMerchantId=444;
    public int totalPrice;
    public int  OrderItems(items items){
        totalPrice=items.getChickenfry()*chickenfry+items.getChickenNoodles()*chickenNoodles;
        return totalPrice;

    }

}

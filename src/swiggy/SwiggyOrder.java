package swiggy;

public class SwiggyOrder implements Swiggypayments{
    private int chickenBiryaniCost = 350;
    private int muttonBiryaniCost= 450;
    private int shawarmaCost = 120;
    private int vennilaCost = 40;
    public int totalCost ;
    public int localMarchantId = 123456;
    public int order(SwiggyItems swiggyItems){
        totalCost=swiggyItems.getChickenBiryani()*chickenBiryaniCost+swiggyItems.getMuttonBiryani()*muttonBiryaniCost+
                swiggyItems.getShawarma()*shawarmaCost+swiggyItems.getVennila()*vennilaCost;

        return totalCost;
    }


    @Override
    public int payments(int txId, int merchantId) {
        return 0;
    }
}

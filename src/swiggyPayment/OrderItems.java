package swiggyPayment;

public class OrderItems {
    private int eggNoodles;
    private int eggFideRice;
    private int chickenBiryani;

    public OrderItems(int eggNoodles, int eggFideRice, int chickenBiryani) {
        this.eggNoodles = eggNoodles;
        this.eggFideRice = eggFideRice;
        this.chickenBiryani = chickenBiryani;
    }

    public int getEggNoodles() {
        return eggNoodles;
    }

    public int getEggFideRice() {
        return eggFideRice;
    }

    public int getChickenBiryani() {
        return chickenBiryani;
    }

    public void setEggNoodles(int eggNoodles) {
        this.eggNoodles = eggNoodles;
    }

    public void setEggFideRice(int eggFideRice) {
        this.eggFideRice = eggFideRice;
    }

    public void setChickenBiryani(int chickenBiryani) {
        this.chickenBiryani = chickenBiryani;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "eggNoodles=" + eggNoodles +
                ", eggFideRice=" + eggFideRice +
                ", chickenBiryani=" + chickenBiryani +
                '}';
    }
}
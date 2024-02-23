package swigyApplication;

public class Products {
    private int chickenBiryani;

    private int vegBiryani;
    private int fishBiryani;
    private int  sweets;
    public Products(int chickenBiryani, int vegBiryani, int fishBiryani, int sweets){
        this.chickenBiryani=chickenBiryani;
        this.vegBiryani=vegBiryani;
        this.fishBiryani=fishBiryani;
        this.sweets=sweets;

    }
    public int getChickenBiryani() {
        return chickenBiryani;
    }

    public int getVegBiryani() {
        return vegBiryani;
    }

    public int getFishBiryani() {
        return fishBiryani;
    }

    public int getSweets() {
        return sweets;
    }
}

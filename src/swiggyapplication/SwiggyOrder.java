package swiggyapplication;

public abstract class SwiggyOrder implements SwiggyInterface {
    private int chickenBiriyaniPrice=500;
    private int naansPrice=300;
    private int muttonBiriyaniPrice=600;
    public int totalCost;
    public int localMarchentId=7890;
    public int order(Product product) {
        totalCost = product.getChickenBiriyani() * chickenBiriyaniPrice + product.getNaans() * naansPrice + product.getMuttonBiriyani() * muttonBiriyaniPrice;
        return totalCost;

    }

    }


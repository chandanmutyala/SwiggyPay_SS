package swiggyLite;

public class FoodItems {
   private int chickenBiriyani;
    private int vegFridRice;
    private int chickenLollipops;
    private int vegManchurian;

    public FoodItems(int chickenBiriyani, int vegFridRice, int chickenLollipops, int vegManchurian) {
        this.chickenBiriyani = chickenBiriyani;
        this.vegFridRice = vegFridRice;
        this.chickenLollipops = chickenLollipops;
        this.vegManchurian = vegManchurian;
    }

    public void setChickenBiriyani(int chickenBiriyani) {
        this.chickenBiriyani = chickenBiriyani;
    }

    public void setVegFridRice(int vegFridRice) {
        this.vegFridRice = vegFridRice;
    }

    public void setChickenLollipops(int chickenLollipops) {
        this.chickenLollipops = chickenLollipops;
    }

    public void setVegManchurian(int vegManchurian) {
        this.vegManchurian = vegManchurian;
    }

    public int getChickenBiriyani() {
        return chickenBiriyani;
    }

    public int getVegFridRice() {
        return vegFridRice;
    }

    public int getChickenLollipops() {
        return chickenLollipops;
    }

    public int getVegManchurian() {
        return vegManchurian;
    }
}

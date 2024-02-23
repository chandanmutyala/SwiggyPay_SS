package swiggyapplication;

public class Product {
    private int chickenBiriyani;
    private int naans;
    private int muttonBiriyani;

    public int getChickenBiriyani() {
        return chickenBiriyani;
    }

    public int getNaans() {
        return naans;
    }

    public int getMuttonBiriyani() {
        return muttonBiriyani;
    }

    public void setChickenBiriyani(int chickenBiriyani) {
        this.chickenBiriyani = chickenBiriyani;
    }

    public void setNaans(int naans) {
        this.naans = naans;
    }

    public void setMuttonBiriyani(int muttonBiriyani) {
        this.muttonBiriyani = muttonBiriyani;
    }

    public Product(int chickenBiriyani, int naans, int muttonBiriyani) {
        this.chickenBiriyani = chickenBiriyani;
        this.naans = naans;
        this.muttonBiriyani = muttonBiriyani;
    }
}

package swiggyInterface;

public class items {
    private int chickenfry;
    private int chickenNoodles;

    public items(int chickenfry, int chickenNoodles) {
        this.chickenfry = chickenfry;
        this.chickenNoodles = chickenNoodles;
    }

    public int getChickenfry() {
        return chickenfry;
    }

    public int getChickenNoodles() {
        return chickenNoodles;
    }

    public void setChickenfry(int chickenfry) {
        this.chickenfry = chickenfry;
    }

    public void setChickenNoodles(int chickenNoodles) {
        this.chickenNoodles = chickenNoodles;
    }
}

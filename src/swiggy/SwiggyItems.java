package swiggy;

public class SwiggyItems {
    private int chickenBiryani;
    private int muttonBiryani;
    private int shawarma;
    private int vennila;
       public SwiggyItems(int chickenBiryani,int muttonBiryani,int shawarma,int vennila){
           this.chickenBiryani=chickenBiryani;
           this.muttonBiryani=muttonBiryani;
           this.shawarma=shawarma;
           this.vennila=vennila;

       }

    public int getChickenBiryani() {
        return chickenBiryani;
    }

    public void setChickenBiryani(int chickenBiryani) {
        this.chickenBiryani = chickenBiryani;
    }

    public int getMuttonBiryani() {
        return muttonBiryani;
    }

    public void setMuttonBiryani(int muttonBiryani) {
        this.muttonBiryani = muttonBiryani;
    }

    public int getShawarma() {
        return shawarma;
    }

    public void setShawarma(int shawarma) {
        this.shawarma = shawarma;
    }

    public int getVennila() {
        return vennila;
    }

    public void setVennila(int vennila) {
        this.vennila = vennila;
    }
}

package swiggyLite;

public  class OrderProcess  {
    PaytmService paytmService;
    private int chickenBiriyani = 350;
    private int vegFridRice = 270;
    private int chickenLollipops = 320;
    private int vegManchurian = 250;
    public int totalCost;
    public int localTxId = 156780856;
    boolean loginS ;


    public int orderProcess(FoodItems foodItems) {
        Login login = new Login();

        try {
               loginS = login.loginStatus(new LoginDetails("Anil@123","Aa12"));
        } catch (InvalidPasswordException e) {
           // System.out.println(e.getCode());
            throw new RuntimeException(e.getCode());
        }

        if (loginS) {
            totalCost = foodItems.getChickenBiriyani() * chickenBiriyani + foodItems.getChickenLollipops() * chickenLollipops +
                    foodItems.getVegFridRice() * vegFridRice + foodItems.getVegManchurian() * vegManchurian;
            System.out.println(totalCost);
        }return totalCost;
        }
        public void setLocalTxId ( int localTxId){
            this.localTxId = localTxId;
        }
    }



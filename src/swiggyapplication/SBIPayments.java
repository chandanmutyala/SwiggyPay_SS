package swiggyapplication;

public class SBIPayments extends SwiggyOrder {
    public int sbiBalance = 5000;
    public int localTransactionId = 20000;


    @Override
    public int payment(int txId, int marchentId) {
        if (txId == localTransactionId && marchentId == localMarchentId) {
            if (totalCost > 0 && sbiBalance >= totalCost) {
                int availableBalance = sbiBalance - totalCost;

                System.out.println("available balance="+availableBalance);
                return availableBalance;

            } else {
                System.out.println("totalcost exceeds sbibalance");
                return sbiBalance;
            }
        }
        System.out.println("marchentId&&txId failed");
        return sbiBalance;
    }
}
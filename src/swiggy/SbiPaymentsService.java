package swiggy;

public class SbiPaymentsService extends SwiggyOrder {
    public int balance = 30000;

    public int localtxId = 345678;
    public int payment(int txId,int marchantId){
        if (txId == localtxId && marchantId == localMarchantId){
            if (totalCost > 0 && balance >= totalCost){
                int availableBalance = balance -totalCost;
                System.out.println(availableBalance);
                return availableBalance;


            }else {
                System.out.println(balance);
                return balance;
            }

        }
        System.out.println("failed");
        return balance;
    }
}

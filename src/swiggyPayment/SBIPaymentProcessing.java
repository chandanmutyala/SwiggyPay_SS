package swiggyPayment;

public class SBIPaymentProcessing extends SwiggyOrder{

int balance = 5000;
int localtxID=3456789;

    @Override
    public int payment(int txid, int merchantId) {
        if (txid==localtxID && txid==merchantId) {
            if(totalCost>0 && balance>=totalCost) {
            }
            int avaliableBalance=balance-totalCost;
            System.out.println(avaliableBalance);
            return avaliableBalance;
            }
        else {
            System.out.println(balance);
            return balance;

        }
    }
}

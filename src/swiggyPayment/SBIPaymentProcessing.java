package swiggyPayment;

public class SBIPaymentProcessing extends SwiggyOrder {
    int balence = 5000;
    int localtxId = 3456789;
    @Override
    public int payment(int txId, int merchantId) {

        if (txId==localtxId && txId==merchantId) {

            if (totalCost>0 && balence>=totalCost){

            }
            int availablebalence=balence-totalCost;
            System.out.println(availablebalence);

            return availablebalence;
        }
        else {
            System.out.println(balence);
            return balence;

        }

    }

    @Override
    public String toString() {
        return "SBIPaymentProcessing{" +
                "balence=" + balence +
                ", localtxId=" + localtxId +
                '}';
    }
}

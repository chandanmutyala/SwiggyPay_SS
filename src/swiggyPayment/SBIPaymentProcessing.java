package swiggyPayment;

public class SBIPaymentProcessing extends SwiggyOrder {
    int balence = 5000;
    int localtxId = 3456789;

    @Override
    public int payment(int txId, int merchantId) {

        if (txId == localtxId && merchantId == localMerchantId) {

            if (totalCost > 0 && balence >= totalCost) {
                int availablebalence = balence - totalCost;
                System.out.println("Payment successful " +availablebalence);
                return availablebalence;
            } else {
                System.out.println(balence);
                return balence;
            }

            }else {
                System.out.println("incorrect txId");
            }

        return balence;
    }
}
package swigyApplication;

public class SbiPaymentService extends SwigyOrderService {
    int sbiBalance = 1000;
    int localTxId = 123;

    @Override
   public int payment(int txId, int merchantId) {
        if (localTxId == txId && localMerchantId == merchantId) {

            if (totalPrice > 0 && sbiBalance >= totalPrice) {
                int availableBalance = sbiBalance - totalPrice;
                System.out.println(" payment successful" + " " + " availableBalance:" + availableBalance);
                return availableBalance;
            }
            else {
                System.out.println("payment failed-in sufficient funds" + "  " + " availableBalance:" + sbiBalance);
                return sbiBalance;
            }
        }else{
            System.out.println("inCorrect txId");

        }
         return sbiBalance;
    }
    }
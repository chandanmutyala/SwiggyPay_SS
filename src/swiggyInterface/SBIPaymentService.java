package swiggyInterface;

public class SBIPaymentService extends SwiggyOrder {
    int localTxId=9977555;
    int balance=1000;
   public  int payment(int txId,int marchantId){
       if(localTxId==txId&& localMerchantId==marchantId){
           if (totalPrice > 0 && balance >= totalPrice) {
               int avaliablebalance = balance - totalPrice;
               return avaliablebalance;
           } else {
               return balance;
           }
       }
return balance;
   }

    }


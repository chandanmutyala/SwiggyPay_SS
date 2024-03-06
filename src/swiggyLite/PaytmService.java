package swiggyLite;

public class PaytmService implements SwiggyPaymentServices {
    OrderProcess orderProcess;
    public int paytmAmount = 10000;
    public  int localmarchentId = 123456;

    @Override
    public int paymentProcess(int txId, int marchent  ) throws InsufficientAmountException {

        if (paytmAmount>=orderProcess.totalCost){
            throw new  InsufficientAmountException (ErrorCodes.SWIGGY_INSUFFICIENT_AMOUNT_1001.getCode(),
                    ErrorCodes.SWIGGY_INSUFFICIENT_AMOUNT_1001.getMessage());
        }
        if (txId==orderProcess.localTxId && localmarchentId == marchent && paytmAmount>=orderProcess.totalCost){

            this.paytmAmount = paytmAmount-orderProcess.totalCost;
            System.out.println("Your Order was placed sucessfully, Order Amount : "+orderProcess.totalCost+"   remaining Amount in your upi is  :"+paytmAmount);
            return paytmAmount;
        }else {
            System.out.println("Your order get cancelled  and your balance in upi :"+paytmAmount);
            return paytmAmount;
        }

    }
}


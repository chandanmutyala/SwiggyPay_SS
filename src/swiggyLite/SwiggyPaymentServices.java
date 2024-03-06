package swiggyLite;

public interface SwiggyPaymentServices {
    int paymentProcess(int txId , int marchent) throws InsufficientAmountException;
}

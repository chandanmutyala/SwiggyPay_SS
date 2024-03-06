package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private  double amt;
    private Date txnDate;
    private boolean marchantDebit;
    private String marchantId;

    public PaymentRequest(double amt, Date txnDate) {
        this.amt = amt;
        this.txnDate = txnDate;
    }

    public boolean isMarchantDebit() {
        return marchantDebit;
    }



    public String getMarchantId() {
        return marchantId;
    }





    public PaymentRequest(String txId, double amt, Date txnDate, boolean marchantDebit,String marchantId) {
        this.txId = txId;
        this.amt = amt;
        this.txnDate = txnDate;
        this.marchantDebit = marchantDebit;
        this.marchantId = marchantId;
    }


    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxnDate() {
        return txnDate;
    }
}

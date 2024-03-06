package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public class SbiBankService {
    private String accountNo = "123456";
    private double amt = 5000;
    private  String marchantAccountNumber="45678";
    private double marchantAmount = 1000;

    public PaymentResponse transfer(PaymentRequest request){
        System.out.println(request.getTxId());
        if (request.isMarchantDebit()){
            marchantAmount = marchantAmount - request.getAmt();
            amt = amt + request.getAmt();
        }else {
            amt = amt + request.getAmt();
            marchantAmount = marchantAmount - request.getAmt();

        }
        String newcorelationId = UUID.randomUUID().toString();
        PaymentResponse response = new PaymentResponse("2233","Success" ,new Date());
        return response;
    }

    public double getMarchantAmount() {
        return marchantAmount;
    }

    public void setMarchantAmount(double marchantAmount) {
        this.marchantAmount = marchantAmount;
    }
}

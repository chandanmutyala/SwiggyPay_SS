package swiggy;

import swiggy.SbiBankService;
import swiggy.SwiggyPaymentService;
import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {
    @Override
    public PaymentResponse payment(PaymentRequest request) {
        /*PaymentRequest paymentInitialRequest = new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),
                request.getAmt(),request.getTxnDate(),false,"12345");*/
        SbiBankService sbiBankService = new SbiBankService();
        return sbiBankService.transfer(request);
    }
}

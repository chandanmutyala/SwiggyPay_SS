package swiggy;

import swiggy.model.Order;
import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;


public abstract class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
//    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService) {
//    }
        public Order getFinalOrder(Order order){
            double tax =0;
            if(order.getPrice() >1000){
                 tax=order.getPrice()*20/10;
            }
            double finalAmt = order.getPrice()+tax+20;
            Order finalOrder=new Order(finalAmt,tax,20);
            finalOrder.setOrderItemsList(order.getOrderItemsList());
            return finalOrder;
        }


        public Order createOrder(Order order){
          Order finalOrder =  getFinalOrder(order);
            PaymentRequest paymentInitialRequest = new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),
                    finalOrder.getPrice(),new Date(),false,"12345");
            PaymentResponse response =swiggyPaymentService.payment(paymentInitialRequest);
            if (response!=null){

                finalOrder.setStatus("Success");
                System.out.println(response.getCorelationId());
        }delivery(finalOrder);
            return finalOrder;


    }
    public abstract boolean delivery(Order order);

}

package swiggy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItems> orderItemsList = new ArrayList<>();
    private double price;
    private int tipAmount;
    private double serviceCharges;
    private String status;
    private  Boolean deliveryStatus;

    public void setDeliveryStatus(Boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Order(double price,double serviceCharges, int tipAmount ) {
        this.price = price;
        this.tipAmount = tipAmount;
        this.serviceCharges = serviceCharges;
    }

    public Order() {

    }

    public void addItem(OrderItems item) {
        orderItemsList.add(item);
        price = price + item.getPrice();
    }

    public void removeItem(OrderItems item) {
        orderItemsList.remove(item);
        price = price - item.getPrice();
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(int tipAmount) {
        this.tipAmount = tipAmount;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }


    public Boolean getDeliveryStatus() {
        return deliveryStatus;
    }
}



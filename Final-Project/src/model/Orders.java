package model;

public class Orders {
    int orderId;

    int customerId;

    double totalAmount;

    @Override
    public String toString() {
        return "order ID = " + orderId + ", customerId = " + customerId + "total amount = " + totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

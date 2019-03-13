package model;

public class OrderDetails {
    int orderDetails;
    int orderId;
    int productId;
    int quantity;
    double subtotal;
    int AcOrNonAc;
    int eatInOrTakeAway;

    @Override
    public String toString() {
        return "Add all fields here once finalized";
    }

    public int getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(int orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getAcOrNonAc() {
        return AcOrNonAc;
    }

    public void setAcOrNonAc(int acOrNonAc) {
        AcOrNonAc = acOrNonAc;
    }

    public int getEatInOrTakeAway() {
        return eatInOrTakeAway;
    }

    public void setEatInOrTakeAway(int eatInOrTakeAway) {
        this.eatInOrTakeAway = eatInOrTakeAway;
    }
}

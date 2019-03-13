package model;

public class Product {
    int productId;

    String productName;
    String productDescription;
    double unitPrice;
    boolean isForTakeAway;
    double calories;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isForTakeAway() {
        return isForTakeAway;
    }

    public void setForTakeAway(boolean forTakeAway) {
        isForTakeAway = forTakeAway;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}

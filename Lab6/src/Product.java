public class Product {
    private String Itemname;
    private double unitPrice;

    public Product(String itemname, double unitPrice) {
        this.Itemname = itemname;
        this.unitPrice = unitPrice;
    }

    public Product() {
        Itemname = "no product";
        unitPrice = 0;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getItemname() {
        return Itemname;
    }

    public String toString() {
        return  getItemname() + " " + "@" + "$" + getUnitPrice() + "/-\n";
    }
}

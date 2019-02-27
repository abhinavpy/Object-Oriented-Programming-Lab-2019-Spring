public class CountedProduct extends Product{
    private int quantity;

    public CountedProduct(String itemname, double unitPrice, int quantity) {
        super(itemname, unitPrice);
        this.quantity = quantity;
    }

    public CountedProduct(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getUnitPrice() {
        return super.getUnitPrice()*quantity;
    }

    @Override
    public String toString() {
        return  getItemname() + " " + "@" + "$" + super.getUnitPrice() + "/- " + quantity + " units " + "$" + getUnitPrice() + "/-\n";
    }
}

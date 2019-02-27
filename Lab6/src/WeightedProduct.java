public class WeightedProduct extends Product{
    private int weight;

    public WeightedProduct(String itemname, double unitPrice, int weight) {
        super(itemname, unitPrice);
        this.weight = weight;
    }

    public WeightedProduct(int weight) {
        this.weight = weight;
    }

    @Override
    public double getUnitPrice() {
        return super.getUnitPrice()*weight;
    }

    @Override
    public String toString() {
        return  getItemname() + " " + "@" + "$" + super.getUnitPrice() + "/- " + weight + " units " + "$" + getUnitPrice() + "/-\n";
    }
}

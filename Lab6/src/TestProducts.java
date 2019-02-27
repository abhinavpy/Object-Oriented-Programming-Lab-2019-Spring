import java.util.Scanner;

public class TestProducts {
    public static void main(String[] args) {
        System.out.println("enter the itemname, unitprice and quantity: ");
        String name, name1;
        double unitprice, unitprice1;
        int quantity, weight;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        //System.out.println(name);
        unitprice = scan.nextDouble();
        //System.out.println(unitprice);

        quantity = scan.nextInt();
        System.out.println(name + " " + unitprice + " " + quantity + "\n");

        CountedProduct product1 = new CountedProduct(name, unitprice, quantity);
        System.out.println(product1.toString());

        System.out.println("enter the itemname, unitprice and weight: ");
        name1 = scan.nextLine();
        unitprice1 = scan.nextDouble();
        weight = scan.nextInt();

        WeightedProduct product2 = new WeightedProduct(name1, unitprice1, weight);
        System.out.println(product2.toString());

    }
}

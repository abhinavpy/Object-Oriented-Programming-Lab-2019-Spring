import java.util.Scanner;

public class TestProducts {
    public static void main(String[] args) {
        System.out.println("enter the itemname, unitprice and quantity: ");
        String name;
        double unitprice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        unitprice = scan.nextDouble();
        quantity = scan.nextInt();

        CountedProduct product1 = new CountedProduct(name, unitprice, quantity);
        System.out.println(product1.toString());

        System.out.println("enter the itemname, unitprice and weight: ");
        name = scan.nextLine();
        unitprice = scan.nextDouble();
        quantity = scan.nextInt();

        WeightedProduct product2 = new WeightedProduct(name, unitprice, quantity);
        System.out.println(product2.toString());

    }
}

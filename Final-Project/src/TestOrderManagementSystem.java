import model.Customer;
import model.Orders;
import model.TakeAwayOrder;

import java.util.Scanner;

public class TestOrderManagementSystem {
    public static void main(String args[]) {
        Customer customer = new Customer();
        Orders order = new Orders();

        int orderType;
        int noOfOrders;
        int AcOrNonAc;
        int noOfMainItems;
        int noOfDrinks;
        int ifDrinks;

        int[] ordersList = new int[100];
        int[] drinksList = new int[100];

        System.out.println("Enter Customer Details :\n1.Customer First Name\n2.Customer Id\n");
        Scanner scan = new Scanner(System.in);
        customer.setCusName(scan.next());
        customer.setCustomerId(scan.nextInt());

        System.out.println("Enter\n1 if you want to take-away\n2 to sit-in:\n");
        orderType = scan.nextInt();

        if(orderType == 1) {
            TakeAwayOrder newtkaway = new TakeAwayOrder();

            //Take-away order
            System.out.println("Enter the number of orders and the orderid by looking at this menu\n");
            newtkaway.displayMenu();
            System.out.println("Enter the number of Items to be ordered: ");
            noOfOrders = scan.nextInt();
            newtkaway.setNoOfOrders(noOfOrders);
            System.out.println("Enter the order id's of the items\n");
            for(int i=0; i<noOfOrders; ++i) {
                ordersList[i] = scan.nextInt();
            }
            newtkaway.setOrdersList(ordersList);

            System.out.println("Enter 1 if you want to have some drinks, 0 otherwise\n");
            ifDrinks = scan.nextInt();
            if(ifDrinks == 1) {
                System.out.println("Enter the drinks and the orderid by looking at this menu\n");
                newtkaway.displayDrinks();
                System.out.println("Enter the number of Items to be ordered: ");
                noOfDrinks = scan.nextInt();
                newtkaway.setNoOfOrders(noOfOrders);
                System.out.println("Enter the order id's of the items\n");
                for(int i=0; i<noOfDrinks; ++i) {
                    drinksList[i] = scan.nextInt();
                }
                newtkaway.setDrinksList(drinksList);
            }

            newtkaway.printPrice();
        }

        else if(orderType == 2) {
            SitInOrder newStin = new SitInOrder();

            //Eat-In order
            System.out.println("Enter the number of orders and the order-id by looking at this menu\n");
            newStin.displayMenu();
            System.out.println("Enter the number of Items to be ordered: ");
            noOfOrders = scan.nextInt();
            newStin.setNoOfOrders(noOfOrders);
            System.out.println("Enter the order id's of the items\n");
            for(int i=0; i<noOfOrders; ++i) {
                ordersList[i] = scan.nextInt();
            }
            newStin.setOrdersList(ordersList);

            System.out.println("Enter 1 if you want to have some drinks, 0 otherwise\n");
            ifDrinks = scan.nextInt();
            if(ifDrinks == 1) {
                System.out.println("Enter the drinks and the orderid by looking at this menu\n");
                newStin.displayDrinks();
                System.out.println("Enter the number of Items to be ordered: ");
                noOfDrinks = scan.nextInt();
                newStin.setNoOfOrders(noOfOrders);
                System.out.println("Enter the order id's of the items\n");
                for(int i=0; i<noOfDrinks; ++i) {
                    drinksList[i] = scan.nextInt();
                }
                newStin.setDrinksList(drinksList);
            }

            newStin.printPrice();
        }
    }
}

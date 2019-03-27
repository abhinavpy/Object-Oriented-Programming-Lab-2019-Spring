import java.util.Scanner;

public class PizzaHut {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m, n, orderno = 0;
        Menu menu = new Menu();

        do{
            System.out.println("1. Add Item to menu\n2. Display menu\n3. New customer");
            n = in.nextInt();
            switch (n){
                case 1: menu.addItem();
                break;
                case 2: menu.displayItems();
                break;
                case 3: Customer customer = new Customer();
                System.out.println("Enter customer name");
                customer.name = in.next();
                    System.out.println("Welcome to Pizza Hut " + customer.name);
                    do{
                        System.out.println("1. See menu\n2. Start new order\n3. Add items to your order\n4. View cart\n5. Checkout\n6. Cancel");
                        m = in.nextInt();
                        switch (m){
                            case 1: menu.displayItems();
                                break;
                            case 2: if(customer.order == null)
                            {
                                customer.makeOrder(++orderno);
                            }
                                break;
                            case 3: if(customer.order != null)
                            {
                                menu.displayItems();
                                System.out.println("Enter item Sl. no and number of items");
                                int t = in.nextInt();
                                int qty = in.nextInt();
                                if(qty < 0)
                                    qty = 0;
                                if(t < 1 || t > menu.items.size())
                                    System.out.println("Please Enter valid Sl.no.");
                                else
                                    customer.order.addItem(menu, t - 1, qty);
                            }
                            else
                                System.out.println("Please start a new order");
                                break;
                            case 4: if(customer.order != null)
                                customer.order.print();
                            else
                                System.out.println("Please start a new order");
                            break;
                            case 5: if(customer.order != null) {
                                customer.order.print();
                                System.out.println("Please pay Rs" + (customer.order.total.comboPrice + customer.order.ACcharge) + " and wait for order number " + customer.order.id);
                            }
                            else
                                System.out.println("Please start a new order");
                                break;
                        }
                    }while(m != 6);
            }
        }while(n != 9);

        Order o = new eatIn();
//        o.addItem(0);
        System.out.println("Welcome to Pizza Hut!!");

    }
}

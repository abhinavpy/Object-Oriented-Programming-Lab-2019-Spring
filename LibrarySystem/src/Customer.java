import java.util.Scanner;

public class Customer {
    String name;
    Order order;

    void makeOrder(int id) {
        System.out.println("Eat-In (1) or  Take-Away (2)");
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        if (type == 1) {
            System.out.println("AC (1) or  Non-AC(2)");
            type = in.nextInt();
            if (type == 1)
                order = new ACeatIn();
            else
                order = new eatIn();
        }
        else
            order = new takeAway();
        order.id = id;
    }
}

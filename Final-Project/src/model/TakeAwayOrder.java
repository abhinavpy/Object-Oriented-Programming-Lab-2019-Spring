package model;

import java.util.ArrayList;
import java.util.List;

public class TakeAwayOrder extends Order{
    int[] ordersList = new int[100];
    int[] drinksList = new int[100];
    final int deliveryPrice = 100;

    public boolean isIfDrinks() {
        return ifDrinks;
    }

    public void setIfDrinks(boolean ifDrinks) {
        this.ifDrinks = ifDrinks;
    }

    boolean ifDrinks;

    int noOfOrders;

    public void printPrice() {
        System.out.println("Total Price= " + getTotalPrice() + deliveryPrice + "\n");
    }


    public String displayMenu() {
        return "1.Margherita - Rs. 100 - 250 Calories - Buy two or more Pizza and Rs.50 Discount\n"
                + "2. Double Cheese - Rs. 180 - 300 Calories - Buy two or more Pizza and Rs.50 Discount\n"
                + "3. Veggie Feast - Rs. 190 - 350 Calories - Buy two or more Pizza and Rs.50 Discount\n"
                + "4. Tandoori Paneer - Rs. 210 - 300 Calories - Buy two or more Pizza and Rs.50 Discount\n"
                + "5. Veggie Lover - Rs. 250 - 320 Calories - Buy two or more Pizza and Rs.50 Discount\n";
    }

    public String displayDrinks() {
        return "1.Coke - Rs. 50 - 250 Calories\n"
                + "2. Sprite - Rs. 80 - 300 Calories\n";
    }

    public void getOrdersList() {
        String order = new String();
        for(int i=0; i < noOfOrders; ++i) {
            if(ordersList[i] == 1) {
                order.concat("1.Margherita - Rs. 100 - 250 Calories\n");
            }
            if(ordersList[i] == 2) {
                order.concat("2. Double Cheese - Rs. 180 - 300 Calories\n");
            }
            if(ordersList[i] == 3) {
                order.concat("3. Veggie Feast - Rs. 190 - 350 Calories\n");
            }
            if(ordersList[i] == 4) {
                order.concat("4. Tandoori Paneer - Rs. 210 - 300 Calories\n");
            }
            if(ordersList[i] == 5) {
                order.concat("5. Veggie Lover - Rs. 250 - 320 Calories\n");
            }
        }
        System.out.println("Your orders are:\n" + order);
    }

    public void setOrdersList(int[] drinksList) {
        this.ordersList = ordersList;
    }

    public void getDrinksList() {
        String drinks = new String();
        for(int i=0; i < noOfOrders; ++i) {
            if (drinksList[i] == 1) {
                drinks.concat("1.Coke - Rs. 50 - 250 Calories\n");
            }
            if (drinksList[i] == 2) {
                drinks.concat("2. Sprite - Rs. 80 - 300 Calories\n");
            }
        }
    }

    public void setDrinksList(int[] drinksList) {
        this.drinksList = drinksList;
    }

};


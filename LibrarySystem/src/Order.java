import java.util.ArrayList;
import java.util.Scanner;

class Order extends Menu{
    public static double ingPrice = 10.0;
    int id;
    double ACcharge;
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();
    Item total = new Item();
    public void addItem(Menu menu, int id, int qty){
        Item menuItem = menu.items.get(id);
        Item item = new Item(menuItem);
        Scanner in = new Scanner(System.in);
        int cnt = menuItem.ingredients.size();
        System.out.println("Sl.no.\t\tIngredient\n");
        for(int i = 0; i < menuItem.ingredients.size(); i++)
            System.out.println(i + 1 + "\t\t\t" + menuItem.ingredients.get(i).name + "\n");
        while(true){
            if (cnt == 0)
                break;
            System.out.println("Would tou like to add any extra Ingredients to this order? 1 == > Yes, 0 ==> No");
            if(in.nextInt() == 1){
                System.out.println("Enter ingredient Sl. no");
                int t = in.nextInt();
                if(t < 1 || t > menuItem.ingredients.size())
                    System.out.println("Please Enter valid Sl.no.");
                else
                {
                    cnt--;
                    item.addIngredient(menuItem.ingredients.get(t - 1));
                }
            }
            else
                break;
        }
        quantities.add(qty);
        items.add(item);
        calcTotal();
    }


    public void calcTotal(){

        for(int i = 0; i < items.size(); i++){
            total.comboPrice += (items.get(i).comboPrice + items.get(i).ingredients.size() * ingPrice) * quantities.get(i);
            total.price += (items.get(i).price + items.get(i).ingredients.size() * ingPrice) * quantities.get(i);
            total.calories += (items.get(i).calories) * quantities.get(i);
        }
        total.price += ACcharge;
        System.out.println("Total\t\t\t\t" + total.calories + "\t\t\t" + total.price + "\t\t\t" + total.comboPrice);
    }

    public void print(){
        System.out.println("Order number : " + id + "\nYour Order till now is :\nSl.no.\t\tName\t\tQty\t\tCalories\t\tPrice\t\tcomboPrice\n");
        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + "\t\t\t" + items.get(i).name + "\t\t\t" + quantities.get(i) + "\t\t\t" + items.get(i).calories * quantities.get(i) + "\t\t\t" + items.get(i).price * quantities.get(i) + "\t\t\t" + items.get(i).comboPrice * quantities.get(i));
            for(int j = 0; j < items.get(i).ingredients.size(); j++){
                System.out.println("\t\t\t\t" + items.get(i).ingredients.get(j).name);
            }
        }
    }
}

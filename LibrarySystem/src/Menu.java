import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(){
        System.out.println("Enter name, type(0 ==> drinks, 1 ==> food), canDeliver(0 ==> No, 1 ==> Yes)proteins, carbohydrates, fats, price and ComboPrice of the item");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int type = in.nextInt();
        int canDeliver = in.nextInt();
        double prot = in.nextDouble();
        double carb = in.nextDouble();
        double fats = in.nextDouble();
        double price = in.nextDouble();
        double combo = in.nextDouble();
        int n;
        Item item = new Item(name, type, carb, fats, prot, price, combo, canDeliver);
        while(true){
            System.out.println("add-on ingredients? 0 ==> No, 1 ==> Yes");
            n = in.nextInt();
            if(n == 1){
                Ingredient ingredient = new Ingredient();
                System.out.println("Enter name of ingredient");
                ingredient.name = in.next();
                item.addIngredient(ingredient);
            }
            else
                break;
        }

        items.add(item);
    }

    public void displayItems(){
        System.out.println("Our Menu :\nSl.no.\t\tName\t\tCalories\t\tPrice\t\tcomboPrice\n");
        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + "\t\t\t" + items.get(i).name + "\t\t\t" + items.get(i).calories + "\t\t\t" + items.get(i).price + "\t\t\t" + items.get(i).comboPrice);
            for(int j = 0; j < items.get(i).ingredients.size(); j++){
                System.out.println("\t\t\t\t" + items.get(i).ingredients.get(j).name);
            }
        }
    }
}

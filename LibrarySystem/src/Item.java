import java.util.ArrayList;

class Item{

    String name;
    int type;
    double carbohydrates = 0, fats = 0, proteins = 0, calories = 0;
    double price = 0, comboPrice = 0;
    public int canDeliver;
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Item() {
    }

    public Item(Item item){
        this.name = item.name;
        this.type = item.type;
        this.carbohydrates = item.carbohydrates;
        this.calories = item.calories;
        this.fats = item.fats;
        this.price = item.price;
        this.comboPrice = item.comboPrice;
    }

    public Item(String name, int type, double carbohydrates, double fats, double proteins, double price, double comboPrice, int canDeliver) {
        this.name = name;
        this.type = type;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.proteins = proteins;
        this.price = price;
        this.comboPrice = comboPrice;
        this.canDeliver = canDeliver;
        calculateCalories();
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void calculateCalories(){
        this.calories = (this.carbohydrates + this.proteins) * 4 + this.fats * 9;
    }

}

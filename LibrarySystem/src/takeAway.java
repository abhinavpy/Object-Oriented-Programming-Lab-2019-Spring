class takeAway extends Order{
    public takeAway(){
        ACcharge = 0;
    }
    @Override
    public void displayItems(){
        System.out.println("Order number : " + id + "\nYour Order till now is :\nSl.no.\t\tName\t\tQty\t\tCalories\t\tPrice\t\tcomboPrice\n");
        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + "\t\t\t" + items.get(i).name + "\t\t\t" + quantities.get(i) + "\t\t\t" + items.get(i).calories * quantities.get(i) + "\t\t\t" + items.get(i).price * quantities.get(i) + "\t\t\t" + items.get(i).comboPrice * quantities.get(i));
            for(int j = 0; j < items.get(i).ingredients.size(); j++){
                System.out.println("\t\t\t\t" + items.get(i).ingredients.get(j).name);
            }
            double pkgCost = 10;
            if(items.get(i).type == 0){
                pkgCost = 5;
            }
            total.comboPrice += (items.get(i).comboPrice + items.get(i).ingredients.size() * ingPrice) * quantities.get(i) + pkgCost;
            total.price += (items.get(i).price + items.get(i).ingredients.size() * ingPrice) * quantities.get(i) + pkgCost;
            total.calories += (items.get(i).calories) * quantities.get(i);
        }
        total.price += ACcharge;
        System.out.println("Total\t\t\t\t" + total.calories + "\t\t\t" + total.price + "\t\t\t" + total.comboPrice);
    }

    @Override
    public void addItem(Menu menu, int id, int qty){

        if(menu.items.get(id).canDeliver == 1)
            super.addItem(menu, id, qty);
        else
            System.out.println("Cannot pack this item. Please select other items.");
    }
}

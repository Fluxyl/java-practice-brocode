package tutorials;

import java.util.ArrayList;

public class ArrayLister {
    public static void main(String[] args) {
        arrayLister();
        arrayListerTwoD();
    }

    static void arrayLister() {

        // ArrayList = a resizable array.
        //      Elements can be removed or added after compilation phase
        //      store reference dat types.

        ArrayList<String> foodList = new ArrayList<String>();

        foodList.add("Bananas");
        foodList.add("Hamburger");
        foodList.add("Hotdog");


        // Useful ArrayList methods. 
        foodList.set(0, "Sushi");
        foodList.remove(2);
        // foodlist.clear() clears the entire ArrayList of Strings.


        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
    }

    static void arrayListerTwoD() {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Donuts");
        bakeryList.add("Garlic Bread");
        
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Peppers");
        produceList.add("Onions");
        
        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soylent");
        drinksList.add("Vodka");
        drinksList.add("Coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        // Retrieve Soylent from drinkList from groceryList
        System.out.println(groceryList.get(2).get(0));

        // Retrieve Onions from produceList from groceryList
        System.out.println(groceryList.get(1).get(2));
    }
}

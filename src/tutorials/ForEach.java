package tutorials;
import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        forEach();
    }

    static void forEach() {
        // for-each =   traversing technique to iterate through the elements in an array/collection
        //              less steps, more readable, but also less flexible.

        // ARRAY METHOD -- COLLECTION METHOD BELOW

        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String i : animals ) {
            System.out.println(i);
        }

        // COLLECTION METHOD

        ArrayList<String> animalList = new ArrayList<String>();

        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Rat");
        animalList.add("Bird");

        for(String i : animalList) {
            System.out.println(i);
        }

    }
}

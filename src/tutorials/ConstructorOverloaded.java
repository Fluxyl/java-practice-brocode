package tutorials;

public class ConstructorOverloaded {
    public static void main(String[] args) {
        
        // overloaded constructors =    multiple constructors within a class with the same name,
        //      but have different parameters. 
        //      name + parameters = signature.

        Pizza pizza = new Pizza("Pepperoni", "LARGE");
        System.out.println(pizza.slices);
    }
}

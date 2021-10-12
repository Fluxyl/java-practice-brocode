package tutorials;

public class Car {
    
    String make = "Honda";
    String model = "Accord";
    int year = 2007;
    String color = "Black";
    double price = 5000.00;

    void drive() {
        System.out.println("You drive the car.");
    }

    void brake() {
        System.out.println("You step on the brakes.");
    }

    // Overriding the default behavior of the toString() method.
    public String toString() {
        return(String.format("Your %d %s %s is %s.", year, make, model, color));
    }
}

package tutorials;

public class ToStringPractice {
    public static void main(String[] args) {
        
        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly and explicitly.

        Car car = new Car();
        
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.color);

        // But what if we wanted to print out car? We could try
        System.out.println(car); // But this returns the address.

    }
}

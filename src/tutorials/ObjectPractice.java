package tutorials;

public class ObjectPractice {
    public static void main(String[] args) {
        objectPractice();
    }

    static void objectPractice() {
        // object = an instance of a class that may containj attributes and methods
        // example: (phone ,desk, computer, coffee cup)
        Car myCar = new Car();
        Car yourCar = new Car();
        
        // Print info about myCar object.
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        // apply drive method
        myCar.drive();
        // apply brake method
        myCar.brake();

        // Print info about yourCar object.
        System.out.println(yourCar.make);
        System.out.println(yourCar.model);
        // apply drive method
        yourCar.drive();
        // apply brake method
        yourCar.brake();
    }
}

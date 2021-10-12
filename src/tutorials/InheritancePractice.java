package tutorials;

public class InheritancePractice {
    public static void main(String[] args) {
        InheritanceCar car = new InheritanceCar();
        InheritanceBicycle bike = new InheritanceBicycle();

        car.go();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);

        // METHOD OVERWRITING AS WELL
        // method overriding = Declaring a method in sub class,
        //                  which is already present in parent class.
        //                  done so that a child class can give its own implementation

        // OVERRIDE
        car.wheelie();
        bike.wheelie();
    }


}

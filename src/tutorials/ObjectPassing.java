package tutorials;

public class ObjectPassing {
    public static void main(String[] args) {
        OPGarage garage = new OPGarage();
        OPCar carOne = new OPCar("BMW");
        OPCar carTwo = new OPCar("Ferrari");
        
        garage.park(carOne);
        garage.park(carTwo);
    }
}

package tutorials;

public class ConstructorPractice {
    public static void main(String[] args) {
        // Send parameters to object constructor
        Human humanOne = new Human("Joshua", 22, 304.6);
        Human humanTwo = new Human("Nick", 25, 175);

        // print out object one's parameters
        System.out.println(humanOne.name);
        System.out.println(humanOne.age);
        System.out.println(humanOne.weight);

        // print out object two's parameters
        System.out.println(humanTwo.name);
        System.out.println(humanTwo.age);
        System.out.println(humanTwo.weight);

        // make human 1 drink and human 2 eat
        humanTwo.eat();
        humanOne.drink();
    }
}

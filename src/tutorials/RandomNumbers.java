package tutorials;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        randomNumbers();
    }

    static void randomNumbers() {
        Random random = new Random();
        
        // Generates random number between [0,5]
        int x = random.nextInt(6);
        //random.nextInt(6)+1 to gen between [1,6]

        // Generates random decimal number between [0, 1]
        double y = random.nextDouble();

        // Generates either true or false.
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

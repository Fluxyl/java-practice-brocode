package tutorials;

public class Arrays {
    public static void main(String[] args) {
        arrayPractice();
        array2DPractice();
    }

    static void arrayPractice() {
        // Arrays are used to store multiple values in a single variable
        String[] cars = {"Camaro", "Corvette", "Tesla"};
        
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        // System.out.println(cars[3]); Will fail because it is out of the bounds.
        
        // Another way to make an array if you know how many spots you will need
        System.out.println("\n|| ANOTHER WAY TO MAKE ARRAY IF YOU KNOW THE AMOUNT OF SPOTS ||\n");
        String[] carsTwo = new String[3];
        carsTwo[0] = "Camaro";
        carsTwo[1] = "Corvette";
        carsTwo[2] = "Tesla";
        System.out.println(cars[2]);

        // A way to print each element in the array using a for loop
        System.out.println("\n|| LOOPING THROUGH EACH VALLUE IN AN ARRAY USING FOR LOOP ||\n");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    static void array2DPractice() {
        System.out.println("|| NEW PROGRAM -- ARRAY2D PRACTICE ||");
        
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i = 0; i <cars.length; i++) {
            System.out.println();
            for (int j = 0; j<cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        // You can also generate a 2D String Array using String twoDArray = {x,y,z},{a,b,c},{d,e,f};
        String exampleArray[][] = {
            {"Apple", "Banana", "Kiwi"},
            {"Turtle", "Zebra", "Wolf"},
            {"Wrangler", "Levi", "AND1"}
        };

        System.out.println("\n\n||Other Array||");
        for (int i = 0; i <exampleArray.length; i++) {
            System.out.println();
            for (int j = 0; j<exampleArray[i].length; j++) {
                System.out.print(exampleArray[i][j] + " ");
            }
        }
    }
}

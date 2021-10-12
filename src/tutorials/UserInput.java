package tutorials;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Call our method inside of main.
        System.out.println(userInput());
    }
    static String userInput() {
        // Create a new Scanner object.
        Scanner scan = new Scanner(System.in);

        // Scan in information such as Name, Age, and Favorite Food.
        System.out.print("\nName: ");
        String userName = scan.nextLine();
        System.out.print("Age: ");
        int userAge = scan.nextInt();

        // CLEAR SCANNER SINCE .nextInt LEFT /n in Scanner object.
        scan.nextLine();

        // Finish scanning in Favorite Food
        System.out.print("Favorite Food: ");
        String userFood = scan.nextLine();

        System.out.println("A wild pokemon appeared! Press x to catch it!");
        String response = scan.next();

        if (response.equals("x")) {
            System.out.println("Pikachu has been captured!");
        }

        // Close Scanner & Return formatted string.
        scan.close();
        return("Hello " + userName + ". I see that you're " + userAge + " years old now. Your favorite food is " + userFood + ".");
    }
}

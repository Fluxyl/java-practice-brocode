package tutorials;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        doWhile();
    }

    static void doWhile() {
        // Do while loop -- execute the stuff in do once then execute the while loop as long as the condition remains true.
        Scanner scan = new Scanner(System.in);
        String name = "";
        
        do {
            System.out.println("Enter your name: ");
            name = scan.nextLine();
        }while (name.isEmpty());
        System.out.println("Hello " + name);
        scan.close();
    }
}

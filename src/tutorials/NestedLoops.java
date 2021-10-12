package tutorials;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        nestedLoopPractice();
    }

    static void nestedLoopPractice() {
        // Generate Scanner
        Scanner scan = new Scanner(System.in);
        
        // Get user input such as rows, columns, and actual character/choice for the array
        System.out.println("Please enter in a character for the grid array.");
        String userChar = scan.nextLine();

        System.out.println("Please enter in the number of rows.");
        int userRows = scan.nextInt();

        System.out.println("Please enter in the number of columns.");
        int userCols = scan.nextInt();

        for (int i = 0; i < userRows; i++) {
            for (int j = 0; j < userCols; j++) {
                System.out.print(userChar + " ");
            }
            System.out.println("");
        }
        scan.close();
    }
}

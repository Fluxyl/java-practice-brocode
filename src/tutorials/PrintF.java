package tutorials;

public class PrintF {
    public static void main(String[] args) {
        printFPractice();
    }

    static void printFPractice() {
        // printf() =    an optional method to control, format, and display text to the console window
        //          two arguments = foprmat striong + (object/variable/value)
        //          % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Joshua";
        int myInt = 50;
        double myDouble = -1000;

        // [conversion-characters] - %b %c %s %d %f
        System.out.printf("\n%b %c %s %d %f\n", myBoolean, myChar, myString, myInt, myDouble);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("\nHello %10s!", myString);
        // vs
        System.out.printf("\nHello %-10s!", myString);
        

        // [precision]
        // set nuymber of digits of precision when outputting floating-point values
        System.out.printf("\nYou have this much money: %.2f", myDouble);



        // [flags]
        // adds an effect to output based on the flags added to format specifier
        // - : left-justify
        // + : output ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("\n\nFlags tester 1: %-+20f", myDouble);
        System.out.printf("\n\nFlags tester 2: %015.3f", myDouble);
        System.out.printf("\n\nFlags tester 3: %,015.3f", myDouble);
    }
}

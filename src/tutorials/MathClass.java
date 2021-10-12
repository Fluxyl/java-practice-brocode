package tutorials;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        mathClass();
        
        // Scan in vals for hypFinder and then pass values.
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nPlease input x: ");
        double x = scan.nextDouble();
        System.out.print("Please input y: ");
        double y = scan.nextDouble();
        System.out.println(hypFinder(x, y));
        scan.close();
        
    }

    static void mathClass() {
        double x = 3.14;
        double y = -10;
        
        // returns the bigger number of two double values.
        double z = Math.max(x, y);
        
        // returns the smaller number of two double values.
        double w = Math.min(x, y);

        // returns the absolute value of a double value.
        double v = Math.abs(y);

        // returns the square root value of a double value. 
        double u = Math.sqrt(x);

        // returns long value of a double value rounded up or down.
        double t = Math.round(x);

        // Rounds up. 
        double s = Math.ceil(x);

        // Rounds down. 
        double r = Math.floor(x);

        System.out.println(z);
        System.out.println(w);
        System.out.println(v);
        System.out.println(u);
        System.out.println(t);
        System.out.println(s);
        System.out.println(r);
    }

    static double hypFinder(double x, double y) {
        return(Math.sqrt(((x * x) + (y * y))));
    }
}

package tutorials;

public class Expressions {
    public static void main(String[] args) {
        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %
        System.out.println(expressionPract());

    }
    static double expressionPract() {
        double friends = 10;

        friends += 1; // Same as friends = friends + 1. 1 can be changed.
        friends++; // Same as above, but only works when adding 1.
        friends--;

        friends = (double) friends / 3;
        return(friends);
    }
}

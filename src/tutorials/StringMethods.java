package tutorials;

public class StringMethods {
    public static void main(String[] args) {
        stringMethods();
    }

    static void stringMethods() {
        String name = "Joshua";

        // ResultOne -- equals and equalsIgnoreCase

        boolean resultOne = name.equals("Joshua"); // Returns a boolean value.
        System.out.println(resultOne);

        resultOne = name.equalsIgnoreCase("Joshua"); // Same, but ignores case
        System.out.println(resultOne);

        // ResultTwo & ResultThree - length and charAt

        int resultTwo = name.length();
        char resultThree = name.charAt(3);
        System.out.println("Your name is " + resultTwo + " characters long and the character in the fourth position is " + resultThree + ".");

        // ResultFour & ResultFive - indexOf and isEmpty
        int resultFour = name.indexOf("s");
        boolean resultFive = name.isEmpty();
        System.out.println("ResultFour = " + resultFour + "& resultFive = " + resultFive);

        // .toUpperCase & 
        // .toLowerCase

        // ResultSix - .trim() trims all the whitespace before and after the string
        String testString = "  Hel l o W or l d      ";
        System.out.println(testString.trim());

        // ResultSeven - replace Replaces *every* instance of a char with another char
        String name2 = name.replace('o', 'a');
        System.out.println(name2);
    }
}

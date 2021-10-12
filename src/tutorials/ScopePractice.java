package tutorials;

public class ScopePractice {
    public static void main(String[] args) {
        
        // local =  declared inside a method
        //          visible only to that method

        // global = declared outside a method, but within a class.
        //          visible to all parts of a class.
        
        diceRollPractice();
    }

    static void diceRollPractice() {
        ScopeDiceRoller diceRoller = new ScopeDiceRoller();
        System.out.println(diceRoller.roll(7));
    }
}

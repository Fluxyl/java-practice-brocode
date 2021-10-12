package tutorials;

public class Switches {
    public static void main(String[] args) {
        switchPractice("Tuesday");
        switchPractice("Wednesday");
        switchPractice("Thursday");
        switchPractice("Pizza");
    }

    static void switchPractice(String inputStr){
        switch(inputStr) {
            case "Sunday": System.out.println("Sunday time.");
            break;

            case "Monday": System.out.println("Monday time.");
            break;
            
            case "Tuesday": System.out.println("Tuesday time.");
            break;
  
            case "Wednesday": System.out.println("Wednesday time.");
            break;

            case "Thursday": System.out.println("Thursday time.");
            break;

            case "Friday": System.out.println("Friday time.");
            break;

            case "Saturday": System.out.println("Saturday time.");
            break;

            default: System.out.println("That is not a day!");
        }
    }
}

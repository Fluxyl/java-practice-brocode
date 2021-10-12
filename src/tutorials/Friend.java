package tutorials;

public class Friend {
    
    String name;
    static int friendNum;

    Friend(String name) {
        this.name = name;
        friendNum++;
    }

    static void displayFriends() {
        System.out.println("You have " + friendNum + " friends.");
    }



}

package tutorials;

public class StaticPractice {
    public static void main(String[] args) {
        
        // Print number of friends, which increments every time we add a friend.
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        // Access the static variable and print to screen
        System.out.println(Friend.friendNum);

        // Also can access through the indivual object itself.
        System.out.println(friend1.friendNum);
        System.out.println(friend2.friendNum);
        System.out.println(friend3.friendNum);
        // but the warning tells you why that's bad.


        // Getting the value of amount of friends via static method
        Friend.displayFriends();
    }
}

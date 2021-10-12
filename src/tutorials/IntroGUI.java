package tutorials;

import javax.swing.JOptionPane;

public class IntroGUI {
    public static void main(String[] args) {
        introGUI();
    }
    static void introGUI() {
        // Pop up a dialog box and ask for the user's name.
        String userName = JOptionPane.showInputDialog("Please type your name.");

        // Display another box that contains the user's name.
        JOptionPane.showMessageDialog(null, "Hello " + userName + "!");

        // Pop up another dialog and ask for the user's age.
        // Since jOptionPane.showInput returns STR, use Int.parseint to get int.
        int userAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        JOptionPane.showMessageDialog(null, "You are " + userAge + " years old.");

        // Finally, ask for userHeight in double form. Use Double.parsedouble to get double
        double userHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height. (cm)"));
        JOptionPane.showMessageDialog(null, "You are " + userHeight + " cm tall.");
    }
}

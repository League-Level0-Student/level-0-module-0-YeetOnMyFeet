package _99_extra;

import javax.swing.JOptionPane;

public class Virus {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello! I work at Microsoft and I am here to tell \n you that you have a virus on your \n computer that we can fix");
	JOptionPane.showMessageDialog(null, "First I need to verify that its really you");
	String name = JOptionPane.showInputDialog("What is you name?");
	String social = JOptionPane.showInputDialog("What is your social sercurity number?");
	String credit = JOptionPane.showInputDialog("What is your credit card number?");
	String live = JOptionPane.showInputDialog("Where do you live?");
	JOptionPane.showMessageDialog(null, "Your name is " + name);
	JOptionPane.showMessageDialog(null, "Your social sercurity number is " + social);
	JOptionPane.showMessageDialog(null, "Your credit card number is " + credit);
	JOptionPane.showMessageDialog(null, "You live at " + live);
	JOptionPane.showInputDialog("Awesome! It really is you. \n");
	JOptionPane.showMessageDialog(null, "I appreciate you giving me (the hacker) \n millions of dollars of personal info");
	JOptionPane.showMessageDialog(null, "Don't give your information to other on the internet!");
		

}
}

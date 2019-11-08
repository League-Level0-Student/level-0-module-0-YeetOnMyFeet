package _99_extra;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!" );
		String emotion = JOptionPane.showInputDialog("How are you on this fine day?");
		
	}

}

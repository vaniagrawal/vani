package smalltextgames;

import javax.swing.JOptionPane;

public class Magic8ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String response, userResponse;
		int number, a ;
		
		
		do {
				
			response = JOptionPane.showInputDialog("Ask the Magic 8-ball a question!");
			number = (int)(Math.random ()*5);
			if (number == 0) {
				JOptionPane.showMessageDialog(null, "The answer is yes!");
			} else if (number == 1) {
				JOptionPane.showMessageDialog(null, "Definitely not. Sorry");
			} else if (number == 2 ) {
				JOptionPane.showMessageDialog(null, "The outcome is likely.");
			} else if (number == 3) {
				JOptionPane.showMessageDialog(null, "Its possible");
			} else {
				JOptionPane.showMessageDialog(null, "Concentrate and ask again");
			}
			
			userResponse = JOptionPane.showInputDialog("Type 1 to ask another question, anything else to quit");
			a = Integer.parseInt(userResponse);
			
		
		} while (a == 1);

	}

}

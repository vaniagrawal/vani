package smalltextgames;

import javax.swing.JOptionPane;

public class additionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		int operation, count = 0, correct = 0, wrong = 0;
		String response;
		int answer;
		
		do {
			a = (int)(Math.random()*101);
			b = (int)(Math.random()*101);
			operation = (int)(Math.random()*4);
			
			if (operation == 0) {
				response = JOptionPane.showInputDialog("What is " + a  + " + " + b + " ?");
				count = count + 1;
				answer = Integer.parseInt(response);
				if (a + b == answer) {
					correct = correct + 1;
					JOptionPane.showMessageDialog(null, "You got it! You have " + (((double)correct / count)*100) + "% correct");
				} else {
					wrong = wrong + 1;
					JOptionPane.showMessageDialog(null, "The answer was " + (a + b) + ". You have " + (((double)correct / count)*100) + "% correct");
				}
				
				JOptionPane.showMessageDialog(null, "You got " + correct + " answers correct and " +  wrong + " answers wrong." );
				
			} else if (operation == 1) {
				response = JOptionPane.showInputDialog("What is " + a  + " - " + b );
				count = count + 1;
				answer = Integer.parseInt(response);
				if (a - b == answer) {
					correct = correct + 1;
					JOptionPane.showMessageDialog(null, "You got it! You have " + ((correct / count )*100) + "% correct");
				} else {
					wrong = wrong + 1;
					JOptionPane.showMessageDialog(null, "The answer was " + (a - b) + ". You have " + (((double)correct / count )*100) + "% correct");
				}
				JOptionPane.showMessageDialog(null, "You got " + correct + " answers correct and " + wrong + " answers wrong.");
				
			} else if (operation == 2) {
				response = JOptionPane.showInputDialog("What is " + a + " * " + b);
				count = count + 1;
				answer = Integer.parseInt(response);
				if (a * b == answer) {
					correct = correct + 1;
					JOptionPane.showMessageDialog(null, "You got it! You have " + ((correct / count )*100) + "% correct");
				} else { 
					wrong = wrong + 1;
					JOptionPane.showMessageDialog(null, "The answer was " + (a * b) + ". You have " + (((double)correct / count)*100) + "% correct");
				}
				JOptionPane.showMessageDialog(null, "You got " + correct + " answers correct and " + wrong + " answers wrong.");
				
			} else {
				response = JOptionPane.showInputDialog("What is " + a + " / " + b );
				count = count + 1;
				answer = Integer.parseInt(response);
				if (a / b == answer) {
					correct = correct + 1;
					JOptionPane.showMessageDialog(null, "You got it! You have " + ((correct / count)*100 ) + "% correct");
				} else {
					wrong = wrong + 1;
					JOptionPane.showMessageDialog(null, "The answer was " + (a / b) + ". You have " + (((double)correct / count)*100) + "% correct");
				}
				
				JOptionPane.showMessageDialog(null, "You got " + correct + " answers correct and " + wrong + " answers wrong.");
				
			}
		
			
			
		} while (correct < 5);

	}

}

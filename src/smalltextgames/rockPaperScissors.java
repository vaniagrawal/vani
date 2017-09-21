package smalltextgames;

import javax.swing.JOptionPane;

public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] moves = { "rock", "paper", "scissors" };
		int computerResponse, a;
		String response;

		do {
			String UserResponse = (String) JOptionPane.showInputDialog(null,
					"Make your move : rock, paper, or scissors? ", "", JOptionPane.QUESTION_MESSAGE, null, moves,
					moves[0]);

			computerResponse = (int) (Math.random() * 3);

			JOptionPane.showMessageDialog(null, "You played " + UserResponse + ".");

			if (computerResponse == 0) {
				// 0 = rock
				JOptionPane.showMessageDialog(null, "The computer played rock.");

				if (UserResponse == "rock") {
					JOptionPane.showMessageDialog(null, "Its a tie");
				} else if (UserResponse == "paper") {
					JOptionPane.showMessageDialog(null, "You win");

				} else if (UserResponse == "scissors") {
					JOptionPane.showMessageDialog(null, "You lose");
				}

			} else if (computerResponse == 1) {
				// 1 = paper
				JOptionPane.showMessageDialog(null, "The computer played paper.");

				if (UserResponse == "rock") {
					JOptionPane.showMessageDialog(null, "You lose.");
				} else if (UserResponse == "paper") {
					JOptionPane.showMessageDialog(null, "Its a tie");
				} else if (UserResponse == "scissors") {
					JOptionPane.showMessageDialog(null, "You win.");
				}

			} else if (computerResponse == 2) {
				// 2 = scissors
				JOptionPane.showMessageDialog(null, "The computer played scissors.");

				if (UserResponse == "rock") {
					JOptionPane.showMessageDialog(null, "You win.");
				} else if (UserResponse == "paper") {
					JOptionPane.showMessageDialog(null, "You lose.");
				} else if (UserResponse == "scissors") {
					JOptionPane.showMessageDialog(null, "Its a tie");
				}
			}

			response = JOptionPane.showInputDialog("Type 1 to play again, anything else to quit");
			a = Integer.parseInt(response);
		} while (a == 1);
		
	}
	
}

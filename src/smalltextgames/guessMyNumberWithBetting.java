package smalltextgames;

import javax.swing.JOptionPane;

public class guessMyNumberWithBetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 100;
		String betsize, response;
		int betNum, userGuess;
		int secretNumber;

		do {

			secretNumber = (int) (Math.random() * 11);
			response = JOptionPane.showInputDialog("Guess a number.");
			userGuess = Integer.parseInt(response);

			do {
				betsize = JOptionPane.showInputDialog("What is your betting?");
				betNum = Integer.parseInt(betsize);
			} while (betNum <= 0 || betNum > money);

			if (userGuess == secretNumber) {
				money = money + betNum;
				JOptionPane.showMessageDialog(null, "You got it!");
				JOptionPane.showMessageDialog(null, "You now have " + money + "$.");
			}

			if (userGuess != secretNumber) {
				money = money - betNum;
				JOptionPane.showMessageDialog(null, "Nope, sorry.");
				JOptionPane.showMessageDialog(null, "You now have " + money + "$.");
			}

		} while (money > 0);

	}

}

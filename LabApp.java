package gameofWar;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();

		Player p1 = new Player();
		Player p2 = new Player();

		for (int i = 0; i < 26; i++) {
			p1.draw(deck);
			p2.draw(deck);
		}
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			System.out.print("Player One has ");
			p1Card.describe();
			System.out.print("Player Two has ");
			p2Card.describe();
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScoreOne();
				System.out.println("Player One wins this round!");
				System.out.println(" ");
				System.out.println(" ");

				p1.finaloneScore();
				p2.finaltwoScore();

			} else if (p1Card.getValue() < p2Card.getValue()) {
				p2.incrementScoreTwo();
				System.out.println("Player Two wins this round!");
				System.out.println(" ");
				System.out.println(" ");

				p2.finaltwoScore();
				p1.finaloneScore();

			} else {
				System.out.println("Draw!");

				System.out.println("");
				System.out.println("");
			}

		}

		// end of round play

		if (p1.score1 > p2.score2) {
			System.out.println("Player One wins!");
		
		} else if (p2.score2 > p1.score1) {
			System.out.println("Player Two wins!");
		
		} else {
			System.out.println("It's a draw!");
		}
	}
}

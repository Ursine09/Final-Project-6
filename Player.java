package gameofWar;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String namePlayer;
	int score1;
	int score2;
	private List<Card> hand = new ArrayList<>();

	public void describe() {
		for (Card card : hand) {
			card.describe();
		}
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void incrementScoreOne() {
		score1 += 1;

	}

	public void incrementScoreTwo() {
		score2 += 1;

	}

	public void finaloneScore() {
		System.out.println("Player One:" + this.score1);
		System.out.println(" ");
	}

	public void finaltwoScore() {
		System.out.println("Player Two:" + this.score2);
		System.out.println(" ");
	}

	public void gameFinalScore() {
		System.out.println("Player One:" + this.score1 + "Player Two" + this.score2);
		System.out.println(" ");

	}

	public Player(String name) {
		// TODO Auto-generated method stub
		this.namePlayer = name;
		this.score1 = 0;
		this.score2 = 0;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	public int getoneScore() {
		return score1;
	}

	public void setooneScore(int score1) {
		this.score1 = score1;
	}

	public int gettwoScore() {
		return score2;
	}

	public void settwoScore(int score2) {
		this.score2 = score2;
	}
}


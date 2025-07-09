package gameofWar;

import java.util.LinkedList;

public class Player {
	
	private String namePlayer;
	private int score;
	private LinkedList<Card> hand;
	
	
	
	
	public Player(String name) {
		// TODO Auto-generated method stub
		this.namePlayer = name;
		this.hand = new LinkedList<>();
		this.score = 0;
	}




	public String getNamePlayer() {
		return namePlayer;
	}




	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}




	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	public LinkedList<Card> getHand() {
		return hand;
	}




	public void setHand(LinkedList<Card> hand) {
		this.hand = hand;
	}

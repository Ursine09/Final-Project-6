package gameofWar;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class LabApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\nQuestion 1 : Card Class");
Card tempCard = new Card("Two", "Hearts", 2);
tempCard.describe();




System.out.println("\nQuestion 2 : Deck Class");
Deck deck = new Deck ();
System.out.println("Deck has been created!");
deck.describe();





System.out.println("\nQuestion 3: Deck shuffle() method") ;

deck.shuffle();
System.out.println("Shuffled Deck:");

deck.describe();





System.out.println("\nQuestion 4: Deck draw() method");

Card drawnCard = deck.draw();
drawnCard.describe();

System.out.println("\nQuestion 5: Create Game");

Map<String, List<Card>> gameBoard = new HashMap<>();
int numberOfPlayers = 2;
gameBoard = createGame(numberOfPlayers);

System.out.println("-------------------------------");
for (int i = 1; i <= numberOfPlayers; i++) {
	String playerName = "Player" + i;
	System.out.println(playerName + "\n-----------");
	List<Card> playerList = gameBoard.get(playerName);
	for (Card handCard : playerList) {
		handCard.describe();
	}
	System.out.println("----------------------------------");
}
	}

	
	private static Map<String, List<Card>> createGame (int numOfPlayers) {
		Map<String, List<Card>> finalGameBoard = new HashMap<>();
		Deck deck = new Deck ();
		deck.shuffle();
		System.out.println("Deck has" + deck.getCards().size() + " cards!");
		
		for (int i = 1; i <= numOfPlayers; i++) {
			List<Card> playerList = new ArrayList <>();
			String playerName = "Player" + i;
			finalGameBoard.put(playerName, playerList);
		}
		
		for (int i = 0; i < 52/numOfPlayers; i++) {
			for (int j = 1; j <= numOfPlayers; j++) {
				String playerName = "Player" + j;
				List<Card> playerList = finalGameBoard.get(playerName);
				playerList.add(deck.draw());
				finalGameBoard.replace(playerName, playerList);
			}
		}
		
		if(52 % numOfPlayers !=0) {
			System.out.print("With " + numOfPlayers + "players -- ");
			System.out.println("Cards left in deck: " + 52%numOfPlayers);
			
		} else {
			System.out.println("All cards have been dealt");
			
		}
		
		
		
		return finalGameBoard;
	}
}

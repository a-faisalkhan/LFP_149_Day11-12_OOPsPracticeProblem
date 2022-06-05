package com.bridgelabz.deckofcards;

public class Cards {
	
	int noOfPlayer;
	int noOfCards;
	DeckOfCard deck;
	Player[] players;

	public Cards(int noOfPlayer, int noOfCards) {
		this.noOfCards = noOfCards;
		this.noOfPlayer = noOfPlayer;
		deck = new DeckOfCard();
		deck.init();
		initPlayers();
	}

	private void initPlayers() {
		players = new Player[noOfPlayer];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(9);
		}
	}

	public void printShuffledCard() {
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player" + i + " cards : ");
			players[i].sortCards();
			players[i].printCards();
			System.out.print("\n");
		}
	}

	public void shuffleCards() {
		for (int i = 0; i < noOfCards; i++) {
			for (int j = 0; j < players.length; j++) {
				int randomNumber = (int) (Math.random()
						* deck.deckOfCard.length);
				players[j].cards[i] = deck.deckOfCard[randomNumber];
				while (deck.deckOfCard[randomNumber]
						.equals("null")) {
					randomNumber = (int) (Math.random()
							* deck.deckOfCard.length);
					players[j].cards[i] = deck.deckOfCard[randomNumber];
				}
				deck.deckOfCard[randomNumber] = "null";
			}
		}
	}

	public static void main(String[] args) {
		Cards card = new Cards(4, 9);
		card.shuffleCards();
		card.printShuffledCard();
	}
}

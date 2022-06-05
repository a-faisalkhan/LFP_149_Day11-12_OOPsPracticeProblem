package com.bridgelabz.deckofcards;

public class Player {
	
	String[] cards;

	public Player(int noOfCards) {
		cards = new String[noOfCards];
	}

	public void printCards() {
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "\t");
		}
	}

	public void sortCards() {
		for (int i = 0; i < cards.length - 1; i++) {
			for (int j = i + 1; j < cards.length; j++) {
				int firstNum;
				switch (cards[i].split("\\(")[0]) {
				case "J":
					firstNum = 11;
					break;
				case "Q":
					firstNum = 12;
					break;
				case "K":
					firstNum = 13;
					break;
				case "A":
					firstNum = 14;
					break;
				default:
					firstNum = Integer.parseInt(
							cards[i].split("\\(")[0]);
					break;
				}
				int secondNum;
				switch (cards[j].split("\\(")[0]) {
				case "J":
					secondNum = 11;
					break;
				case "Q":
					secondNum = 12;
					break;
				case "K":
					secondNum = 13;
					break;
				case "A":
					secondNum = 14;
					break;
				default:
					secondNum = Integer.parseInt(
							cards[j].split("\\(")[0]);
					break;
				}
				if (firstNum > secondNum) {
					String temp = cards[i];
					cards[i] = cards[j];
					cards[j] = temp;
				}
			}
		}
	}
}

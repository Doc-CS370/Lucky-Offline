package com.offline.logic;

public class player {

	int[] playerHand = new int[10];
	int handIndex = 0;
	int spiteTokens = 0;
	int playerLocation = 0;
	int turnsLeft = 0;
	String name;
	boolean isAlive = false;

	public int[] getPlayerHand() {
		return playerHand;
	}

	public card[] drawSevenCards(card[] Card) {

		int cardsDrawn = 0;
		while (cardsDrawn != 7) {

			// Card[96].print(); //TO SEE IF CARD ARRAY MADE IT HERE

			int randInt = (int) (Math.random() * 97);
			if ((Card[randInt].getCardStatus()) == 0) {
				playerHand[handIndex] = (Card[randInt].getCardNumber());
				handIndex++;
				System.out.println(Card[randInt].getCardFlavor() + " has been added to hand.");
				Card[randInt].setCardStatus(1);
				cardsDrawn++;
			}
		}

		return Card;
	}

	public card[] drawCard(card[] Card) {
		System.out.println("SINGLE DRAW");

		int cardsDrawn = 0;

		if (handIndex < 9) {

			while (cardsDrawn != 1) {

				int randInt = (int) (Math.random() * 97);
				if ((Card[randInt].getCardStatus()) == 0) {

					playerHand[handIndex] = (Card[randInt].getCardNumber());
					handIndex++;
					System.out.println(Card[randInt].getCardFlavor() + " has been added to hand.");
					Card[randInt].setCardStatus(1);
					cardsDrawn++;
				}
			}

		} else {
			System.out.println("PLAYER HAS TOO MANY CARDS");
		}

		return Card;
	}

	public void setAlive() {
		isAlive = true;

	}

	public boolean getStatus() {

		return isAlive;
	}

	public void setName(String newName) {

		name = newName;
	}

	public String getName() {

		return name;
	}

	public void setLocation(int newVal) {

		playerLocation = newVal;
	}

	public int getLocation() {

		return playerLocation;
	}

	public void endTurn() {

		turnsLeft--;
	}

	public int getTurnsLeft() {

		return turnsLeft;
	}

	public void addTurns(int val) {

		turnsLeft = turnsLeft + val;

	}
}

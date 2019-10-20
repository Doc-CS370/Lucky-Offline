package com.offline.logic;

public class cardAbility {
	
	public static void useRoomCard(room[] Room, card[] Card, player[] player, int cardNum, int targetPlayer) {
		Card[cardNum].setCardStatus(2);
		System.out.println("////////////////ATTEMPTING USE OF CARD//////////////");
		Card[cardNum].print();
		System.out.println("////////////////////////////////////////////////////");
		
		
		System.out.println("TARGET PLAYER: " + targetPlayer);
		System.out.println("CURRENT LOCATION: " + player[targetPlayer].getLocation());
		System.out.println("CURRENT ROOM POPULATION: " + Room[player[targetPlayer].getLocation()].getNumberOfOccupants());
		Room[player[targetPlayer].getLocation()].removeOccupant();
		Room[Card[cardNum].getCardValue()].addOccupant();
		player[targetPlayer].setLocation(Card[cardNum].getCardValue());
		System.out.println("////////////////////////////////////////////////////");
		System.out.println("TARGET PLAYER: " + targetPlayer);
		System.out.println("CURRENT LOCATION: " + player[targetPlayer].getLocation());
		System.out.println("CURRENT ROOM POPULATION: " + Room[player[targetPlayer].getLocation()].getNumberOfOccupants());
	}
	
	public static void useMoveCard(card[] Card, player[] player, int cardNum, int playerTurn) {
		Card[cardNum].setCardStatus(2);
		System.out.println("////////////////ATTEMPTING USE OF CARD//////////////");
		Card[cardNum].print();
		System.out.println("////////////////////////////////////////////////////");
		
		System.out.println("CURRENT TURNS LEFT: " + player[playerTurn].getTurnsLeft());
		System.out.println("ATTEMPTING TO ADD " + Card[cardNum].getCardValue() + " MOVES");
		player[playerTurn].addTurns(Card[cardNum].getCardValue());
		System.out.println("PLAYER NOW HAS " + player[playerTurn].getTurnsLeft() + " TURNS");
	}
}

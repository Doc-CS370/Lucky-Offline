package com.offline.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loadCards {

	public static card[] compileDeck() throws FileNotFoundException {
		card[] Card = new card[98];
		Scanner cardIn = new Scanner(new File("./assets/cards.txt"));

		for (int i = 0; cardIn.hasNext(); i++) {
			Card[i] = new card();
			Card[i].setCardNumber(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardType(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardValue(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardSpecialValue(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardLocation(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardFlavor(cardIn.nextLine());

			//System.out.println("LOADED: ");
			//Card[i].print();

		}
		cardIn.close();

		return Card;
	}

}

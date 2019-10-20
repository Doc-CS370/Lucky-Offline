package com.offline.logic;

public class drLuckyMovement {
	public void drLuckyMovement(player drLucky) {																			//Dr. Lucky Movement
		int currentRoom = drLucky.getLocation(), nextRoom = -1, turnOrderCheck, nextPlayer;
		boolean inRoom = false;
		if ((currentRoom >= 0)&&(currentRoom< 19)) {					//Improvement Idea: each room object has a variable that determines if it's on Dr. Lucky's path, it's the end of Dr. Lucky's path, or it's not on Dr. Lucky's path. Or an array?
			nextRoom = currentRoom+1;
		}
		else if (currentRoom == 19 ) {
			nextRoom = 0;
		}
		else if (currentRoom >19) {
			nextRoom = board[currentRoom].getHighestAdjRoom();				//board = Array of rooms of the Board
		}
		else {
			System.out.println("This shouldn't be possible, there's a bug"); //
		}
		drLucky.setLocation(nextRoom);									
		
		
		if (currentPlayer == numPlayer) {								//Which player's turn was it before Dr. Lucky; maximum number of Players
			nextPlayer = 1;
		}
		else {
			nextPlayer = currentPlayer +1;
		}
		
		if (turnCounter >= numPlayer) {										//Dr. Lucky Turn Change Mechanic; turn Counter number of turns the game has had (if turns > num of players, Dr. Lucky can change turn order
			if (board[nextRoom].getOccupants() >1 ) {
				turnOrderCheck =currentPlayer;
				do {
					if (turnOrder[turnOrderCheck].getRoom() == nextRoom) {			//turnOrder = array of players in turn order. I.E. player in position 2 goes after player in position 1 in most cases
						nextPlayer = turnOrder[turnOrderCheck].getID();
						inRoom = true;
					}
					if (turnOrderCheck == numPlayer) {
						turnOrderCheck = 1;
					}
					else {
						turnOrderCheck++;
					}
				}while(inRoom == false);
			}
		}
		//something that passes turn to Next Player
	}
	
}

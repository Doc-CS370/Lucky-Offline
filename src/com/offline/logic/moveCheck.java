package com.offline.logic;

public class moveCheck {

	public static boolean isMoveValid(room[] Room, player[] player, int desiredRoom, int activeTurn) {
		boolean isMoveValid = false;

		int[] adjacentRooms = Room[player[activeTurn].getLocation()].getAdjacentRooms();

		for (int i = 0; i < adjacentRooms.length; i++) {
			if (adjacentRooms[i] == desiredRoom) {
				isMoveValid = true;
				System.out.println("MOVE IS VALID, PROCEED");
			}

		}

		return isMoveValid;

	}

}

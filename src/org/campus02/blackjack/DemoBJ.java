package org.campus02.blackjack;

import java.util.HashMap;

public class DemoBJ {

	public static void main(String[] args) {

		Player steve = new Player("Steve",28);
		Player luke = new Player("Luke",17);
		
		HashMap<Player, Integer> players = new HashMap<>();
		
		Blackjack game = new Blackjack(players);
		
		System.out.println("Spieler wurde hinzugefügt: "+game.add(steve));
		System.out.println("Spieler wurde hinzugefügt: "+game.add(luke));
		
		System.out.println(game.addCard(steve, 18));
		System.out.println(game.addCard(luke,20));
		System.out.println(game.addCard(steve, 3));
		
		System.out.println("Steve hat: "+game.getValue(steve)+" / Luke hat: "+game.getValue(luke));
		
		if(game.getValue(steve)==game.getValue(luke))
			System.out.println("Steve's the ultimate winner!");
		else 
			System.out.println("ok luke has luck this time, so he won");
	
		System.out.print(game);
	}

}

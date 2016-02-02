package org.campus02.blackjack;

import java.util.HashMap;

public class Blackjack {

	private HashMap<Player, Integer> players = new HashMap<>();
	
	
	public Blackjack(HashMap<Player, Integer> players) {
		super();
		this.players = players;
	}

	public boolean add(Player player){
		if(!players.containsKey(player)){
			players.put(player, 0);
			return true;
		}
			else
				return false;
	}
	
	public boolean addCard(Player player, Integer cardValue){
		if(players.containsKey(player)){
			int currentValue = players.get(player);
			players.put(player, currentValue + cardValue);
			return true; 
		}
		else 
			return false;
	}
	
	public Integer getValue(Player player){
		return players.get(player);
	}

	@Override
	public String toString(){
		String result = "";
		for (Player p : players.keySet()) {
			result += p.getName() +
						", Kartenwert: "+players.get(p)+"\n";
		}
		return result;
	}	
}

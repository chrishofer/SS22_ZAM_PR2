package at.campus02.blackjack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private Map<Player, Integer> players;
    public Blackjack() {
        players = new HashMap<Player, Integer>();
    }
    public boolean add(Player player)
    {
        if (players.containsKey(player))
        {
            return false;
        }

        players.put(player, 0);
        return true;
    }
    public boolean addCard(Player player, Integer cardValue)
    {
        if(!players.containsKey(player))
        {
            return false;
        }

        Integer value = players.get(player);
        value += cardValue;
        players.put(player, value);

        return true;
    }
    public Integer getValue(Player player)
    {
        return players.get(player);
    }
    public Player getWinner(){
        Player w = null;
        int punkte = -1;

        for(Player p: players.keySet()){
            int punkteP = players.get(p);
            if(punkteP <= 21) {
                if (punkteP > punkte) {
                    punkte = punkteP;
                    w = p;
                } else {
                    if (punkteP == punkte) {
                        w = null;
                    }
                }
            }
        }

        return w;
    }
    @Override
    public String toString() {
        String s = "";
        for(Player p : players.keySet())
        {
            s += p.getName() + ", Kartenwert: " + players.get(p) + "\n";
        }
        return s;
    }
}
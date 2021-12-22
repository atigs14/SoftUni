package guild;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Guild {
    private String name;
    private int capacity;
    private Map<String, Player> players;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.players = new LinkedHashMap<>();
    }
    public void addPlayer(Player player){
        if (capacity > players.size()){
            this.players.put(player.getName(), player);
        }
    }
    public int count(){
        return this.players.size();
    }
    public boolean removePlayer(String name){
        Player remove = this.players.remove(name);
        return remove != null;
    }

    public void promotePlayer(String name) {
        Player player = this.players.get(name);
        player.setRank("Member");
    }

    public void demotePlayer(String name) {
        Player player = this.players.get(name);
        player.setRank("Trial");
    }
    
    public Player[] kickPlayersByClass(String clazz){

        List<String> names = new ArrayList<>();

        for (var entry : players.entrySet()) {
            Player player = entry.getValue();
            if (player.getClazz().equals(clazz)){
                names.add(entry.getKey());
            }
        }

        Player[] removedPlayers = new Player[names.size()];

        for (int i = 0; i < names.size(); i++) {
            Player player = this.players.remove(names.get(i));
            removedPlayers[i] = player;
        }

        return  removedPlayers;
    }

    public String report() {
        StringBuilder out = new StringBuilder("Players in the guild: " + name + ":" + System.lineSeparator());

        for (Player p: players.values()) {
            out.append(p)
                    .append(System.lineSeparator());
        }
        return out.toString().trim();
    }
}

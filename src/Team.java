import java.util.ArrayList;

class Team {
    private String name;
    private ArrayList<Player> players;

    Team(String name){
        this.setName(name);
        this.setPlayers(new ArrayList<Player>());
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player){
        this.players.add(player);
        player.setTeam(this);
    }

    public void setPlayers(ArrayList<Player> players) {this.players = players;
    }
}


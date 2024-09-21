package Team;

import java.util.ArrayList;
import java.util.List;

import Player.Player;

public class Team implements ITeam {
    private int teamID;
    private int userID;
    private List<Player> playerList;

    public Team(int teamID, int userID) {
        this.teamID = teamID;
        this.userID = userID;
        this.playerList = new ArrayList<>();
    }

    @Override
    public void addPlayer(Player player) {
        System.out.println("Add a player to the fantasy team.");
    }

    @Override
    public void removePlayer(Player player) {
        System.out.println("Remove a player from the fantasy team.");
    }

}

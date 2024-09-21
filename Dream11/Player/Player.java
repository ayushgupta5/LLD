package Player;

public class Player implements IPlayer{
    private int playerId;
    private String playerName;
    private String teamName;
    private int points;

    public Player(int playerId, String playerName, String teamName, int points) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamName = teamName;
        this.points = points;
    }


}

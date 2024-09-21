package User;

import Contest.Contest;
import Game.Game;
import Player.Player;
import java.util.List;

public class User implements IUser {
    private int userID;
    private String userName;
    private String email;
    private double walletBalance;

    public User(int userID, String userName, String email, double walletBalance) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.walletBalance = walletBalance;
    }

    @Override
    public void joinContest(Contest contest) {
        System.out.println("User is Jpining the Contest: " +contest);
    }


    @Override
    public void createTeam(Game game, List<Player> players) {
        System.out.println("User is Creating the Team with this Game: " + game);
    }

}

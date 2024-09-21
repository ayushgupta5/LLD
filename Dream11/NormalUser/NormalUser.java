package NormalUser;

import User.User;
import Team.Team;

import java.util.ArrayList;
import java.util.List;

public class NormalUser extends User implements INormalUser {
    List<Team> listOfTeams;
    public NormalUser(int userID, String userName, String email, double walletBalance) {
        super(userID, userName, email, walletBalance);
        this.listOfTeams = new ArrayList<>();
    }

    @Override
    public void createTeam() {
        System.out.println("Allows a normal user to create a team");
    }

    @Override
    public void joinContest() {
        System.out.println("Allows a normal user to join a contest.");
    }
}

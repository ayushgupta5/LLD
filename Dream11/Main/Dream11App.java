package Main;

import AdminUser.AdminUser;
import Contest.Contest;
import NormalUser.NormalUser;
import Player.Player;
import Team.Team;
import Game.Game;

public class Dream11App {
    public static void main(String[] args) {
        Team team = new Team(1, 1);
        Player Kohli = new Player(1, "Kohli", "INDIA", 10);
        Player Rohit = new Player(2, "Rohit", "INDIA", 10);
        Player Jadeja = new Player(3, "Jadeja","INDIA", 10);
        Player Ashwin = new Player(4, "Ashwin", "INDIA", 10);
        Player Dhoni = new Player(5, "Dhoni", "INDIA", 10);

        team.addPlayer(Kohli);
        team.addPlayer(Rohit);
        team.addPlayer(Jadeja);
        team.addPlayer(Ashwin);
        team.addPlayer(Dhoni);

        team.removePlayer(Jadeja);

        NormalUser normalUser = new NormalUser(1, "Kohli", "Kohli@gmail.com", 100.00);
        normalUser.createTeam();
        normalUser.joinContest();

        AdminUser adminUser = new AdminUser(2, "Admin", "Admin@gmail.com", 100.00);
        adminUser.manageUser();

        Game game = new Game(1, "CRICKET");

        Contest contest = new Contest(1, 100.00, 100.00, game);
        contest.calculateWinners();
    }
}

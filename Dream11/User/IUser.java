package User;

import Player.Player;
import Contest.Contest;
import Game.Game;
import java.util.List;

public interface IUser {
    void joinContest(Contest contest);
    void createTeam(Game game, List<Player> players);
}

package AdminUser;

import Game.Game;
public interface IAdminUser {
    void createContest(Game game, double entryFee, double prizePool);
    void manageUser();
}

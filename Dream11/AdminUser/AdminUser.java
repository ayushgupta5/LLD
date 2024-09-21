package AdminUser;

import User.User;
import Game.Game;
public class AdminUser extends User implements  IAdminUser {
    public AdminUser(int userID, String userName, String email, double walletBalance) {
        super(userID, userName, email, walletBalance);
    }

    @Override
    public void createContest(Game game, double entryFee, double prizePool) {
        System.out.println("Allows the admin to create a contest for a specific game.");
    }

    @Override
    public void manageUser() {
        System.out.println("Admin can manage user accounts (not detailed here).");
    }
}

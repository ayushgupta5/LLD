package Service.FriendRequest;

import Model.User;

public class FriendRequestService implements IFriendRequestService {

    @Override
    public void acceptRequest(User user1, User user2) {
        System.out.println("Accept the friend request.");
    }

    @Override
    public void rejectRequest(User user1, User user2) {
        System.out.println("Reject the friend request.");
    }
}

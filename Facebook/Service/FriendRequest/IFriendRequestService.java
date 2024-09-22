package Service.FriendRequest;

import Model.User;

public interface IFriendRequestService {
    void acceptRequest(User user1, User user2);
    void rejectRequest(User user1, User user2);
}

package Chat;

import User.User;
import java.time.LocalDateTime;

public class Chat implements IChat {
    private int chatID;
    private String message;
    private User sender;
    private LocalDateTime date;

    public Chat(int chatID, String message, User sender, LocalDateTime date) {
        this.chatID = chatID;
        this.message = message;
        this.sender = sender;
        this.date = date;
    }

    @Override
    public void sendMessage() {
        System.out.println("Message is sent in the chat");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Message is received in the chat");
    }
}

package Game;

import java.time.LocalDateTime;

public class Game implements IGame {
    private int gameID;
    private String ganeName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    public Game(int gameID, String ganeName) {
        this.gameID = gameID;
        this.ganeName = ganeName;
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now().plusHours(2);
    }
}

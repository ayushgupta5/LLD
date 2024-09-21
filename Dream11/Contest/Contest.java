package Contest;

import Game.Game;

public class Contest implements IContest {
    private int contestId;
    private double entryFee;
    private double prizePool;
    private Game game;

    public Contest(int contestId, double entryFee, double prizePool, Game game) {
        this.contestId = contestId;
        this.entryFee = entryFee;
        this.prizePool = prizePool;
        this.game = game;
    }

    @Override
    public void calculateWinners() {
        System.out.println("Calculates and declares winners of the contest.");
    }
}

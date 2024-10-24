package model.player;

import model.ladder.Ladder;
import model.ladder.LadderLine;

public class Player {

    private final Name name;
    private final Position position;

    public Player(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void climbLadder(Ladder ladder) {
        for (LadderLine ladderLine : ladder.getLadder()) {

            int direction = ladderLine.determinePlayerPossibleDirection(getPosition());

            moveByDirection(direction);
        }
    }

    private void moveByDirection(int direction) {
        position.move(direction);
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }
}

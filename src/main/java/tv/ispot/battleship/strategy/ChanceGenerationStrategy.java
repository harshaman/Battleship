package tv.ispot.battleship.strategy;

import tv.ispot.battleship.model.Player;
import tv.ispot.battleship.model.Target;

import java.util.List;

public interface ChanceGenerationStrategy {

    /**
     * Returns the current player's opponent to target.
     * In a 2 player game, it is always the 2nd player who doesn't have the next chance.
     * @param opponenets
     * @param gameMode
     * @param curPlayerId
     * @return
     */
    public Target getTarget(List<Player> opponenets, int gameMode, int curPlayerId);
}

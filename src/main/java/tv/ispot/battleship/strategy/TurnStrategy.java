package tv.ispot.battleship.strategy;

import tv.ispot.battleship.model.Player;

import java.util.List;

public interface TurnStrategy {
    /**
     * Returns the first player to start the game, throws an exception if there are less than 2 players.
     * @param players
     * @return
     * @throws Exception
     */
    Integer firstPlayer(List<Player> players) throws Exception;

    /**
     * Picks the next player to take a hit at the opponent's board. Default implementation uses round-robin approach.
     * @param curPlayer
     * @param players
     * @return
     */
    Integer nextPlayer(Integer curPlayer, List<Player> players);
}

package tv.ispot.battleship.strategy;

import tv.ispot.battleship.model.Player;

import java.util.List;

public interface WinnerStrategy {
    /**
     * Template to return a winner of the game. Default implementation checks if there is only one player remaining
     * with atleast one ship alive.
     * @param players
     * @return
     */
    Player announceWinner(List<Player> players);
}

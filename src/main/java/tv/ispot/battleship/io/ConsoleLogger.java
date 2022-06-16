package tv.ispot.battleship.io;

import tv.ispot.battleship.model.Player;

import java.util.List;

public interface ConsoleLogger {
    /**
     * Prints the ID of the player who won the game. Default implementation prints it to console.
     * @param winner
     */
    void printWinner(Player winner);

    /**
     * Prints the current player's board status. Default implementation prints it to console.
     * @param player
     */
    void printPlayerGameBoard(Player player);

    /**
     *  Prints the opponent(s) board status. Default implementation prints it to console.
     * @param playerList
     * @param curPlayer
     */
    void printOpponentGameBoard(List<Player> playerList, Player curPlayer);

    /**
     * Logs a message to the console in the default implementation.
     * @param msg
     */
    void print(String msg);
}

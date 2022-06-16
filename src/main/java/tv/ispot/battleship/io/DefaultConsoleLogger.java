package tv.ispot.battleship.io;

import org.apache.log4j.Logger;
import tv.ispot.battleship.model.Player;

import java.util.List;

public class DefaultConsoleLogger implements ConsoleLogger{
    private static final Logger LOG = Logger.getLogger(DefaultConsoleLogger.class);

    @Override
    public void printWinner(Player winner) {
        LOG.info("Game over!");
        LOG.info(String.format("Player %d has won the game", winner.getId()));
    }

    @Override
    public void printPlayerGameBoard(Player player) {
        LOG.info(String.format("Player %d board:", player.getId()));
        LOG.info(String.format("Board boundary: %s", player.getBoard().getBoundary()));
        LOG.info(String.format("Ships: %s", player.getBoard().getShips()));
        LOG.info(String.format("Hits: %s", player.getBoard().getHitPositions()));
        LOG.info(String.format("Misses: %s\n", player.getBoard().getMissPositions()));
    }

    @Override
    public void printOpponentGameBoard(List<Player> playerList, Player curPlayer) {
        playerList.stream().filter(player -> player.getId() != curPlayer.getId())
                .forEach(player -> printGameBoard(player));
    }

    @Override
    public void print(String msg) {
        LOG.info(msg);
    }

    private void printGameBoard(Player player) {
        LOG.info(String.format("Player %d board: \n", player.getId()));
        LOG.info(String.format("Board boundary: %s", player.getBoard().getBoundary()));
        LOG.info(String.format("Hits: %s", player.getBoard().getHitPositions()));
        LOG.info(String.format("Misses: %s", player.getBoard().getMissPositions()));
    }
}

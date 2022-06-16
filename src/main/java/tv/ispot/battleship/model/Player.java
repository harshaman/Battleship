package tv.ispot.battleship.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import tv.ispot.battleship.strategy.ChanceGenerationStrategy;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Player {
    private int id;

    private Board board;
    private ChanceGenerationStrategy strategy;

    /**
     * checks if all the ships have sunk for a given player.
     * @return
     */
    public boolean allShipsSunk() {
        return board.isGameOver();
    }

    /**
     * take a hit at opponent's board on a given {@param coordinate}.
     * @param coordinate
     */
    @SneakyThrows
    public void takeHit(TwoDPlane coordinate) {
        board.hit(coordinate);
    }

    /**
     * Finds and returns a target for the current player in their turn.
     * The players apart from the current player are added to a 'opponents' list.
     * @param playerList
     * @param gameMode
     * @param curPlayerId
     * @return
     */
    public Target turn(List<Player> playerList, int gameMode, int curPlayerId) {
        List<Player> opponents = new ArrayList<>();
        playerList.forEach(player -> {
            if(player.getId()!=getId()){
                opponents.add(player);
            }
        });
        return strategy.getTarget(opponents, gameMode, curPlayerId);
    }

}

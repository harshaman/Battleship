package tv.ispot.battleship;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.log4j.Logger;
import tv.ispot.battleship.io.ConsoleLogger;
import tv.ispot.battleship.model.Player;
import tv.ispot.battleship.model.Target;
import tv.ispot.battleship.strategy.TurnStrategy;
import tv.ispot.battleship.strategy.WinnerStrategy;

import java.util.List;

@AllArgsConstructor
public class Game {
    private List<Player> players;
    private ConsoleLogger consoleLogger;
    private TurnStrategy turnStrategy;
    private WinnerStrategy winnerStrategy;

    @SneakyThrows
    public void startGame(int gameMode) {
        int curPlayerIdx = turnStrategy.firstPlayer(players);
        Player winner=null;
        consoleLogger.print("Battleship has begun!");
        do {
            Player curPlayer = players.get(curPlayerIdx);
            consoleLogger.print(String.format("Player %s's turn: ", curPlayer.getId()));
            Target playersTarget = curPlayer.turn(players, gameMode, curPlayer.getId());
            playersTarget.getTargetPlayer().takeHit(playersTarget.getTargetCoords());

            consoleLogger.printPlayerGameBoard(curPlayer);
            consoleLogger.printOpponentGameBoard(players, curPlayer);
            winner = winnerStrategy.announceWinner(players);
            curPlayerIdx = turnStrategy.nextPlayer(curPlayerIdx, players);
        }while(winner==null);
        consoleLogger.printWinner(winner);
    }



}

package tv.ispot.battleship.strategy;

import lombok.NoArgsConstructor;
import tv.ispot.battleship.model.Player;

import java.util.List;

@NoArgsConstructor
public class DefaultWinnerStrategy implements WinnerStrategy{
    @Override
    public Player announceWinner(List<Player> players) {
        long playersAlive = players.stream().filter(player -> player.allShipsSunk()).count();
        return playersAlive==1 ?
            players.stream().filter(player -> !player.allShipsSunk()).findFirst().get() : null;
    }
}

package tv.ispot.battleship.strategy;

import tv.ispot.battleship.model.Player;

import java.util.List;

public class DefaultTurnStrategy implements TurnStrategy {
    @Override
    public Integer firstPlayer(List<Player> players) throws Exception {
        if(players.size()==0)
            throw new Exception("There must be atleast 2 players to play the game!");
        return 0;
    }

    @Override
    public Integer nextPlayer(Integer curPlayer, List<Player> players) {
        return (curPlayer+1) % players.size();
    }
}

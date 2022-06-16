package tv.ispot.battleship.strategy;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import tv.ispot.battleship.io.InputParams;
import tv.ispot.battleship.io.SystemInput;
import tv.ispot.battleship.model.Player;
import tv.ispot.battleship.model.Target;
import tv.ispot.battleship.model.TwoDPlane;

import java.util.List;

@AllArgsConstructor
public class DefaultChanceGenerationStrategy implements ChanceGenerationStrategy {

    private SystemInput systemInput;

    @Override
    @SneakyThrows
    public Target getTarget(List<Player> opponents, int gameMode, int curPlayerId) {
        InputParams params;
        if(gameMode == 1 && curPlayerId==2){
            params = systemInput.getRandomInput();
        }else {
            params = systemInput.getInputFromSystem();
        }

        Player targetPlayer = opponents.stream().filter(
                opponent -> opponent.getId() == params.getPlayer()).findFirst().get();
        return new Target(targetPlayer, new TwoDPlane(
                params.getTargetCoordinates().getX(), params.getTargetCoordinates().getY()));
    }
}

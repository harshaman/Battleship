package tv.ispot.battleship.model;

import lombok.Data;

@Data
public class Target {

    Player targetPlayer;
    TwoDPlane targetCoords;

    public Target(Player targetPlayer, TwoDPlane targetCoords) {
        this.targetPlayer = targetPlayer;
        this.targetCoords = targetCoords;
    }
}

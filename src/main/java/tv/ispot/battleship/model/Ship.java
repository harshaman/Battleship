package tv.ispot.battleship.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Ship {
    private int length;
    private Boundary boundary;

    /**
     * Checks if a player's ship has sunk (all the coordinates have been hit).
     * @param hitPositions
     * @return
     */
    public boolean hasSunk(List<TwoDPlane> hitPositions) {
        List<TwoDPlane> shipLoc = boundary.getAllCoordinates();
        for (TwoDPlane shipCoordinate: shipLoc) {
            if (!hitPositions.contains(shipCoordinate)) {
                return false;
            }
        }
        return true;
        //return !shipLoc.stream().anyMatch(pos -> !hitPositions.contains(pos));
    }

    public boolean contains(TwoDPlane position) {
        return boundary.contains(position);
    }

}

package tv.ispot.battleship.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {
    private List<Ship> ships;
    private Boundary boundary;
    private List<TwoDPlane> bombPositions;

    public Board(List<Ship> ships, Boundary boundary) {
        this.bombPositions = new ArrayList<>();
        this.ships = ships;
        this.boundary = boundary;
    }

    /**
     * Returns true if there is only one player remaining with atleast one ship alive.
     * @return
     */
    public boolean isGameOver() {
        return ships.stream().anyMatch(ship -> !ship.hasSunk(bombPositions))? false: true;
    }

    /**
     * Returns a list of the locations chosen by the current player, if that location has hit a ship of the opponent.
     * @return
     */
    public List<TwoDPlane> getHitPositions() {
        List<TwoDPlane> hitPositions = new ArrayList<>();
        for(TwoDPlane coord: bombPositions) {
            for(Ship ship: ships) {
                if (ship.contains(coord)) {
                    hitPositions.add(coord);
                    break;
                }
            }
        }

        return hitPositions;
    }

    /**
     * Returns a list of the locations chosen by the current player,
     * if that location was a miss (didn't have any opponent's ship at that location).
     *
     * @return
     */
    public List<TwoDPlane> getMissPositions() {
        final List<TwoDPlane> missPositions = new ArrayList<>();

        for (TwoDPlane coordinate: bombPositions) {
            boolean shipPresentAtLoc = false;
            for (Ship ship: ships) {
                if (ship.contains(coordinate)) {
                    shipPresentAtLoc = true;
                    break;
                }
            }
            if (!shipPresentAtLoc) {
                missPositions.add(coordinate);
            }
        }

        return missPositions;
    }

    public void hit(TwoDPlane coordinate) throws Exception {
        if(!boundary.contains(coordinate)) {
            throw new Exception("Coordinate should be within the boundary");
        }
        bombPositions.add(coordinate);
    }
}

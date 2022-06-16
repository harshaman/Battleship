package tv.ispot.battleship.model;

import java.util.List;

public interface Boundary {
    /**
     * Returns all the coordinates within a boundary (top left and bottom right)
     * @return
     */
    List<TwoDPlane> getAllCoordinates();

    /**
     * Checks if a 2D coordinate is contained withoin  a boundary
     * @param planarCoord
     * @return
     */
    boolean contains(TwoDPlane planarCoord);
}

package tv.ispot.battleship.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BoundaryImpl implements Boundary {

    private TwoDPlane coordTopLeft;
    private TwoDPlane coordBottomRight;

    /**
     * Returns all the coordinates within a given topLeft and bottonRight coordinate of a rectangular boundary.
     * In order to destroy a ship, a player must hit all the coordinates within a boundary.
     * @return
     */
    @Override
    public List<TwoDPlane> getAllCoordinates() {
        List<TwoDPlane> coordinates = new ArrayList<>();
        for (int i = coordTopLeft.getX(); i <= coordBottomRight.getX(); i++) {
            for (int j = coordTopLeft.getY(); j >= coordBottomRight.getY(); j--) {
                coordinates.add(new TwoDPlane(i, j));
            }
        }
        return coordinates;
    }

    /**
     * Checks if the given coordinate lies within the boundary of the {@param planerCoord}.
     * @param planerCoord
     * @return
     */
    @Override
    public boolean contains(TwoDPlane planerCoord) {
        return planerCoord.getX() >= coordTopLeft.getX() && planerCoord.getX() <= coordBottomRight.getX()
                && planerCoord.getY() >= coordBottomRight.getY() && planerCoord.getY() <= coordTopLeft.getY();
    }
}

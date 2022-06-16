package tv.ispot.battleship.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import tv.ispot.battleship.model.TwoDPlane;

@Data
@AllArgsConstructor
public class InputParams {
    private int player;
    private TwoDPlane targetCoordinates;
}

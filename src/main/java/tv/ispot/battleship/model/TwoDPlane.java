package tv.ispot.battleship.model;

import lombok.Data;

@Data
public class TwoDPlane {
    private int x;
    private int y;

    public TwoDPlane(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

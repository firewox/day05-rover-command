import java.util.Objects;

public class Rover {
    private int x;
    private int y;
    private String orientation;
    private String movement;

    public Rover(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String report() {
        if (this.orientation == "N") {
            if (Objects.equals(this.movement, "M")) {
                return "(" + x + "," + (y+1) + "," + orientation + ")";
            }
        }
        return "(" + x + "," + y + "," + orientation + ")";
    }
}

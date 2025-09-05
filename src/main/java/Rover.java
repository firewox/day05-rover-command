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

        if (Objects.equals(this.orientation, "N")) {
            if (Objects.equals(this.movement, "M")) {
                this.y++;
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "W";
                return formatOutputReport(this.orientation);
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "E";
            }
        } else if (Objects.equals(this.orientation, "E")) {
            if (Objects.equals(this.movement, "M")) {
                this.x++;
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "N";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "S";
            }
        } else if (Objects.equals(this.orientation, "S")) {
            if (Objects.equals(this.movement, "M")) {
                this.y--;
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "E";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "W";
            }
        } else if (Objects.equals(this.orientation, "W")) {
            if (Objects.equals(this.movement, "M")) {
                this.x--;
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "S";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "N";
            }
        }
        return formatOutputReport(orientation);
    }

    private String formatOutputReport(String orientation) {
        return "(" + x + "," + y + "," + orientation + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getOrientation() {
        return orientation;
    }
}

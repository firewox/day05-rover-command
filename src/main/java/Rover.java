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
                this.y++;
                return "(" + x + "," + y + "," + orientation + ")";
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "W";
                return "(" + x + "," + y + "," + this.orientation + ")";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "E";
                return "(" + x + "," + y + "," + this.orientation + ")";
            }
        } else if (this.orientation == "E") {
            if (Objects.equals(this.movement, "M")) {
                this.x++;
                return "(" + x + "," + y + "," + orientation + ")";
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "N";
                return "(" + x + "," + y + "," + this.orientation + ")";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "S";
                return "(" + x + "," + y + "," + this.orientation + ")";
            }
        } else if (this.orientation == "S") {
            if (Objects.equals(this.movement, "M")) {
                this.y--;
                return "(" + x + "," + y + "," + orientation + ")";
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "E";
                return "(" + x + "," + y + "," + orientation + ")";
            } else if (Objects.equals(this.movement, "R")) {
                this.orientation = "W";
                return "(" + x + "," + y + "," + orientation + ")";
            }
        } else if (this.orientation == "W") {
            if (Objects.equals(this.movement, "M")) {
                this.x--;
                return "(" + x + "," + y + "," + orientation + ")";
            } else if (Objects.equals(this.movement, "L")) {
                this.orientation = "S";
                return "(" + x + "," + y + "," + orientation + ")";
            }
        }
        return "(" + x + "," + y + "," + orientation + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}

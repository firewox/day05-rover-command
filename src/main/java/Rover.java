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
        switch (this.orientation) {
            case "N":
                handleMovementWhenOrientationIsNorth();
                break;
            case "E":
                handleMovementWhenOrientationIsEast();
                break;
            case "S":
                handleMovementWhenOrientationIsSouth();
                break;
            case "W":
                handleMovementWhenOrientationIsWest();
                break;
        }
        return formatOutputReport(orientation);
    }

    private void handleMovementWhenOrientationIsWest() {
        switch (this.movement) {
            case "M":
                this.x--;
                break;
            case "L":
                this.orientation = "S";
                break;
            case "R":
                this.orientation = "N";
                break;
        }
    }

    private void handleMovementWhenOrientationIsSouth() {
        switch (this.movement) {
            case "M":
                this.y--;
                break;
            case "L":
                this.orientation = "E";
                break;
            case "R":
                this.orientation = "W";
                break;
        }
    }

    private void handleMovementWhenOrientationIsEast() {
        switch (this.movement) {
            case "M":
                this.x++;
                break;
            case "L":
                this.orientation = "N";
                break;
            case "R":
                this.orientation = "S";
                break;
        }
    }

    private void handleMovementWhenOrientationIsNorth() {
        switch (this.movement) {
            case "M":
                this.y++;
                break;
            case "L":
                this.orientation = "W";
                break;
            case "R":
                this.orientation = "E";
                break;
        }
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

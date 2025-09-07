import java.util.Arrays;

public class Rover {
    private int x;
    private int y;
    private String orientation;
    private String command;

    public Rover(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setBatchCommands(String... commands) {
        this.command = String.join("", commands);
    }

    public void executeCommand() {
        Arrays.stream(this.command.split("")).forEach(this::executeCommand);
    }

    public String executeCommand(String cmd) {
        switch (this.orientation) {
            case "N":
                handleMovementWhenOrientationIsNorth(cmd);
                break;
            case "E":
                handleMovementWhenOrientationIsEast(cmd);
                break;
            case "S":
                handleMovementWhenOrientationIsSouth(cmd);
                break;
            case "W":
                handleMovementWhenOrientationIsWest(cmd);
                break;
            default:
                break;
        }
        return formatOutputReport(orientation);
    }

    private void handleMovementWhenOrientationIsWest(String cmd) {
        switch (cmd) {
            case "M":
                this.x--;
                break;
            case "B":
                this.x++;
                break;
            case "L":
                this.orientation = "S";
                break;
            case "R":
                this.orientation = "N";
                break;
            default:
                break;
        }
    }

    private void handleMovementWhenOrientationIsSouth(String cmd) {
        switch (cmd) {
            case "M":
                this.y--;
                break;
            case "B":
                this.y++;
                break;
            case "L":
                this.orientation = "E";
                break;
            case "R":
                this.orientation = "W";
                break;
            default:
                break;
        }
    }

    private void handleMovementWhenOrientationIsEast(String cmd) {
        switch (cmd) {
            case "M":
                this.x++;
                break;
            case "B":
                this.x--;
                break;
            case "L":
                this.orientation = "N";
                break;
            case "R":
                this.orientation = "S";
                break;
            default:
                break;
        }
    }

    private void handleMovementWhenOrientationIsNorth(String cmd) {
        switch (cmd) {
            case "M":
                this.y++;
                break;
            case "B":
                this.y--;
                break;
            case "L":
                this.orientation = "W";
                break;
            case "R":
                this.orientation = "E";
                break;
            default:
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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverCommandTest {

    @Test
    void show_return_new_position_when_move_forward_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setCommand("M");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(1, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setCommand("M");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(1, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setCommand("M");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(-1, marsVehicle.getY());
        assertEquals("S", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setCommand("M");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(-1, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("W", marsVehicle.getOrientation());

    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setCommand("L");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("W", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setCommand("L");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setCommand("L");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setCommand("L");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("S", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_right_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setCommand("R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_right_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setCommand("R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("S", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_right_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setCommand("R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("W", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_right_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setCommand("R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }


    @Test
    void show_return_new_position_when_move_backward_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setCommand("B");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(-1, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_backward_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setCommand("B");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(-1, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_backward_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setCommand("B");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(1, marsVehicle.getY());
        assertEquals("S", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_move_backward_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setCommand("B");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(1, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("W", marsVehicle.getOrientation());

    }

    @Test
    void show_return_new_position_when_execute_commands_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setBatchCommands("M","L","B","R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(1, marsVehicle.getX());
        assertEquals(1, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_execute_commands_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setBatchCommands("M","L","B","R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(1, marsVehicle.getX());
        assertEquals(-1, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_execute_commands_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setBatchCommands("M","L","B","R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(-1, marsVehicle.getX());
        assertEquals(-1, marsVehicle.getY());
        assertEquals("S", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_execute_commands_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setBatchCommands("M","L","B","R");
        //When
        marsVehicle.executeCommand();
        //Then
        assertEquals(-1, marsVehicle.getX());
        assertEquals(1, marsVehicle.getY());
        assertEquals("W", marsVehicle.getOrientation());
    }
}

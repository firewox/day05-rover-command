import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverCommandTest {

    @Test
    void show_return_new_position_when_move_forward_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setMovement("M");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals("(0,1,N)", newPosition);
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setMovement("M");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals("(1,0,E)", newPosition);
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setMovement("M");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals("(0,-1,S)", newPosition);
    }

    @Test
    void show_return_new_position_when_move_forward_and_orientation_west() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "W");
        marsVehicle.setMovement("M");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals("(-1,0,W)", newPosition);
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_north() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "N");
        marsVehicle.setMovement("L");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals("(0,0,W)", newPosition);
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_east() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "E");
        marsVehicle.setMovement("L");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("N", marsVehicle.getOrientation());
    }

    @Test
    void show_return_new_position_when_turn_left_and_orientation_south() {
        //Given
        Rover marsVehicle = new Rover(0, 0, "S");
        marsVehicle.setMovement("L");
        //When
        String newPosition = marsVehicle.report();
        //Then
        assertEquals(0, marsVehicle.getX());
        assertEquals(0, marsVehicle.getY());
        assertEquals("E", marsVehicle.getOrientation());
    }
}

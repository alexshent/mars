package ua.alexshent.mars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTest {

    private Control control;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        control = new Control();
    }

    @Test
    void travel() {
        // given
        Location expectedLocation = new Location(3, 5);
        Direction expectedDirection = Direction.WEST;
        // when
        control.travel();
        // then
        Location actualLocation = control.getRover().getLocation();
        Direction actualDirection = control.getRover().getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }
}
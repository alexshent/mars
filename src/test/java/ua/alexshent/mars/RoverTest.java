package ua.alexshent.mars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover(new Location(0, 0), Direction.NORTH);
    }

    @Test
    void orientNorthAndMoveForward() {
        // given
        Direction expectedDirection = Direction.NORTH;
        Location expectedLocation = new Location(0, 1);
        // when
        rover.setDirection(Direction.NORTH);
        rover.forward();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientEastAndMoveForward() {
        // given
        Direction expectedDirection = Direction.EAST;
        Location expectedLocation = new Location(1, 0);
        // when
        rover.setDirection(Direction.EAST);
        rover.forward();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientSouthAndMoveForward() {
        // given
        Direction expectedDirection = Direction.SOUTH;
        Location expectedLocation = new Location(0, -1);
        // when
        rover.setDirection(Direction.SOUTH);
        rover.forward();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientWestAndMoveForward() {
        // given
        Direction expectedDirection = Direction.WEST;
        Location expectedLocation = new Location(-1, 0);
        // when
        rover.setDirection(Direction.WEST);
        rover.forward();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientNorthAndMoveBack() {
        // given
        Direction expectedDirection = Direction.NORTH;
        Location expectedLocation = new Location(0, -1);
        // when
        rover.setDirection(Direction.NORTH);
        rover.back();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientEastAndMoveBack() {
        // given
        Direction expectedDirection = Direction.EAST;
        Location expectedLocation = new Location(-1, 0);
        // when
        rover.setDirection(Direction.EAST);
        rover.back();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientSouthAndMoveBack() {
        // given
        Direction expectedDirection = Direction.SOUTH;
        Location expectedLocation = new Location(0, 1);
        // when
        rover.setDirection(Direction.SOUTH);
        rover.back();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientWestAndMoveBack() {
        // given
        Direction expectedDirection = Direction.WEST;
        Location expectedLocation = new Location(1, 0);
        // when
        rover.setDirection(Direction.WEST);
        rover.back();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientNorthAndRotateRight() {
        // given
        Direction expectedDirection = Direction.EAST;
        Location expectedLocation = new Location(1, 0);
        // when
        rover.setDirection(Direction.NORTH);
        rover.right();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientEastAndRotateRight() {
        // given
        Direction expectedDirection = Direction.SOUTH;
        Location expectedLocation = new Location(0, -1);
        // when
        rover.setDirection(Direction.EAST);
        rover.right();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientSouthAndRotateRight() {
        // given
        Direction expectedDirection = Direction.WEST;
        Location expectedLocation = new Location(-1, 0);
        // when
        rover.setDirection(Direction.SOUTH);
        rover.right();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientWestAndRotateRight() {
        // given
        Direction expectedDirection = Direction.NORTH;
        Location expectedLocation = new Location(0, 1);
        // when
        rover.setDirection(Direction.WEST);
        rover.right();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientNorthAndRotateLeft() {
        // given
        Direction expectedDirection = Direction.WEST;
        Location expectedLocation = new Location(-1, 0);
        // when
        rover.setDirection(Direction.NORTH);
        rover.left();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientEastAndRotateLeft() {
        // given
        Direction expectedDirection = Direction.NORTH;
        Location expectedLocation = new Location(0, 1);
        // when
        rover.setDirection(Direction.EAST);
        rover.left();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientSouthAndRotateLeft() {
        // given
        Direction expectedDirection = Direction.EAST;
        Location expectedLocation = new Location(1, 0);
        // when
        rover.setDirection(Direction.SOUTH);
        rover.left();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }

    @Test
    void orientWestAndRotateLeft() {
        // given
        Direction expectedDirection = Direction.SOUTH;
        Location expectedLocation = new Location(0, -1);
        // when
        rover.setDirection(Direction.WEST);
        rover.left();
        // then
        Location actualLocation = rover.getLocation();
        Direction actualDirection = rover.getDirection();
        assertEquals(expectedLocation, actualLocation);
        assertEquals(expectedDirection, actualDirection);
    }
}
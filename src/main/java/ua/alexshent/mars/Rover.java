package ua.alexshent.mars;

public class Rover {
    private Location location;
    private Direction direction;

    public Rover(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void forward() {
        switch (direction) {
            case NORTH -> location.setY(location.getY() + 1);
            case EAST -> location.setX(location.getX() + 1);
            case SOUTH -> location.setY(location.getY() - 1);
            case WEST -> location.setX(location.getX() - 1);
        }
    }

    public void back() {
        switch (direction) {
            case NORTH -> location.setY(location.getY() - 1);
            case EAST -> location.setX(location.getX() - 1);
            case SOUTH -> location.setY(location.getY() + 1);
            case WEST -> location.setX(location.getX() + 1);
        }
    }

    public void right() {
        direction = Direction.rotateRight(direction);
        forward();
    }

    public void left() {
        direction = Direction.rotateLeft(direction);
        forward();
    }

}

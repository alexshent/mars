package ua.alexshent.mars;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public static Direction rotateRight(Direction direction) {
        int ordinal = direction.ordinal() + 1;
        if (ordinal > Direction.WEST.ordinal()) {
            ordinal = Direction.NORTH.ordinal();
        }
        return Direction.values()[ordinal];
    }

    public static Direction rotateLeft(Direction direction) {
        int ordinal = direction.ordinal() - 1;
        if (ordinal < Direction.NORTH.ordinal()) {
            ordinal = Direction.WEST.ordinal();
        }
        return Direction.values()[ordinal];
    }
}

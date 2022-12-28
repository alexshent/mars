package ua.alexshent.mars;

public class Control {
    private Rover rover;

    public Rover getRover() {
        return rover;
    }

    public void travel() {
        final Location initialLocation = new Location(0, 0);
        final Direction initialDirection = Direction.NORTH;

        rover = new Rover(initialLocation, initialDirection);
        System.out.println("START");
        printRoverPosition();

        System.out.println("FORWARD");
        rover.forward();
        printRoverPosition();

        System.out.println("FORWARD");
        rover.forward();
        printRoverPosition();

        System.out.println("FORWARD");
        rover.forward();
        printRoverPosition();

        System.out.println("RIGHT");
        rover.right();
        printRoverPosition();

        System.out.println("FORWARD");
        rover.forward();
        printRoverPosition();

        System.out.println("LEFT");
        rover.left();
        printRoverPosition();

        System.out.println("FORWARD");
        rover.forward();
        printRoverPosition();

        System.out.println("LEFT");
        rover.left();
        printRoverPosition();

        System.out.println("BACK");
        rover.back();
        printRoverPosition();

        System.out.println("BACK");
        rover.back();
        printRoverPosition();
    }

    private void printRoverPosition() {
        System.out.println(rover.getDirection().toString());
        System.out.println(rover.getLocation().toString());
        System.out.println("----------------");
    }
}

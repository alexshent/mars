package ua.alexshent.mars;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public boolean equals(Object object) {
        return this.x == ((Location) object).getX()
                && this.y == ((Location) object).getY();
    }

    @Override
    public String toString() {
        return String.format("x = %d, y = %d", x, y);
    }
}

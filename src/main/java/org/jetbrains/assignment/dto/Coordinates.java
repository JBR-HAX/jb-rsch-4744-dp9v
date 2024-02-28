package org.jetbrains.assignment.dto;

public record Coordinates(
        int x,
        int y
) {
    public Coordinates moveX(int x) {
        return new Coordinates(this.x + x, this.y);
    }

    public Coordinates moveY(int y) {
        return new Coordinates(this.x, this.y + y);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

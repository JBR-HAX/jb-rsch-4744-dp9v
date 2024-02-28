package org.jetbrains.assignment.dto;

public record Move(
        Directions direction,
        int steps
) {
    @Override
    public String toString() {
        return "Move{" +
                "direction=" + direction +
                ", steps=" + steps +
                '}';
    }
}

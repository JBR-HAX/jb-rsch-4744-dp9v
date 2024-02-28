package org.jetbrains.assignment.dto;

public record Move(
        Directions direction,
        int steps
) {
}

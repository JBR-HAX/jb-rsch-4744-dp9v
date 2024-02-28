package org.jetbrains.assignment.services;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Directions;
import org.jetbrains.assignment.dto.Move;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class PathCalculatorTest {

    @Test
    void calculate() {
        var input = List.of(
                new Coordinates(0, 0),
                new Coordinates(1, 0),
                new Coordinates(1, 3),
                new Coordinates(0, 3),
                new Coordinates(0, 0)
        );

        var response = new PathCalculator().calculatePath(input);

        assertThat(response).containsExactly(
                new Move(Directions.EAST, 1),
                new Move(Directions.NORTH, 3),
                new Move(Directions.WEST, 1),
                new Move(Directions.SOUTH, 3)
        );
    }
}
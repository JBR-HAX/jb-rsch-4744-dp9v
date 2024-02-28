package org.jetbrains.assignment.services;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Directions;
import org.jetbrains.assignment.dto.Move;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LocationsCalculatorTest {

    @Test
    void calculateLocations() {
        var input = List.of(
                new Move(Directions.EAST, 1),
                new Move(Directions.NORTH, 3),
                new Move(Directions.EAST, 3),
                new Move(Directions.SOUTH, 5),
                new Move(Directions.WEST, 2)
        );
        var result = new LocationsCalculator().calculateLocations(input);
        assertThat(result).containsExactly(
                new Coordinates(0, 0),
                new Coordinates(1, 0),
                new Coordinates(1, 3),
                new Coordinates(4, 3),
                new Coordinates(4, -2),
                new Coordinates(2, -2)
        );
    }
}
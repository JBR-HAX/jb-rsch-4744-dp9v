package org.jetbrains.assignment.services;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Directions;
import org.jetbrains.assignment.dto.Move;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovesCalculator {
    public List<Move> calculatePath(List<Coordinates> coordinates) {
        if (coordinates.size() <= 1) {
            return List.of();
        }
        var res = new ArrayList<Move>();
        for (int i = 0; i < coordinates.size() - 1; i++) {
            res.add(calculateMove(coordinates.get(i), coordinates.get(i + 1)));
        }
        return res;
    }

    public Move calculateMove(Coordinates x, Coordinates y) {
        if (x.x() == y.x()) {
            var step = y.y() - x.y();
            if (step > 0) {
                return new Move(Directions.NORTH, step);
            } else {
                return new Move(Directions.SOUTH, -step);
            }
        } else {
            var step = y.x() - x.x();
            if (step > 0) {
                return new Move(Directions.EAST, step);
            } else {
                return new Move(Directions.WEST, -step);
            }
        }
    }
}

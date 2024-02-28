package org.jetbrains.assignment.services;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Move;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationsCalculator {



    public List<Coordinates> calculateLocations(List<Move> moves) {
        var currentPoint = new Coordinates(0, 0);
        var res = new ArrayList<Coordinates>();
        res.add(currentPoint);

        for (Move move : moves) {
            currentPoint = switch (move.direction()){
                case EAST -> currentPoint.moveX(move.steps());
                case WEST -> currentPoint.moveX(-move.steps());
                case NORTH -> currentPoint.moveY(move.steps());
                case SOUTH -> currentPoint.moveY(-move.steps());
            };
            res.add(currentPoint);
        }
        return res;
    }
}

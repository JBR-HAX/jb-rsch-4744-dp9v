package org.jetbrains.assignment.controllers;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Move;
import org.jetbrains.assignment.services.CoordinatesCalculator;
import org.jetbrains.assignment.services.PathCalculator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class MainController {

    public final CoordinatesCalculator coordinatesCalculator;
    public final PathCalculator pathCalculator;

    public MainController(
            CoordinatesCalculator coordinatesCalculator,
            PathCalculator pathCalculator
    ) {
        this.coordinatesCalculator = coordinatesCalculator;
        this.pathCalculator = pathCalculator;
    }

    @PostMapping("/locations")
    public List<Coordinates> locations(@RequestBody List<Move> moves) {
        return coordinatesCalculator.calculateLocations(moves);
    }


    @PostMapping("/moves")
    public List<Move> moves(@RequestBody List<Coordinates> coordinates) {
        return pathCalculator.calculatePath(coordinates);
    }
}

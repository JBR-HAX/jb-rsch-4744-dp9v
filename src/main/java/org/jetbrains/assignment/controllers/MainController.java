package org.jetbrains.assignment.controllers;

import org.jetbrains.assignment.dto.Coordinates;
import org.jetbrains.assignment.dto.Move;
import org.jetbrains.assignment.models.ReqResp;
import org.jetbrains.assignment.repo.ReqRespRepo;
import org.jetbrains.assignment.services.LocationsCalculator;
import org.jetbrains.assignment.services.MovesCalculator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class MainController {

    public final LocationsCalculator coordinatesCalculator;
    public final MovesCalculator movesCalculator;

    public final ReqRespRepo reqRespRepo;

    public MainController(
            LocationsCalculator coordinatesCalculator,
            MovesCalculator movesCalculator,
            ReqRespRepo reqRespRepo
    ) {
        this.coordinatesCalculator = coordinatesCalculator;
        this.movesCalculator = movesCalculator;
        this.reqRespRepo = reqRespRepo;
    }

    @PostMapping("/locations")
    public List<Coordinates> locations(@RequestBody List<Move> moves) {
        var response = coordinatesCalculator.calculateLocations(moves);
        reqRespRepo.save(new ReqResp(moves.toString(), response.toString(), "/locations"));
        return response;
    }


    @PostMapping("/moves")
    public List<Move> moves(@RequestBody List<Coordinates> coordinates) {
        var response = movesCalculator.calculatePath(coordinates);
        reqRespRepo.save(new ReqResp(coordinates.toString(), response.toString(), "/moves"));
        return response;
    }
}

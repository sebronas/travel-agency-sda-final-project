package com.sda.travelagency.controller;

import com.sda.travelagency.converter.TripConverter;
import com.sda.travelagency.dto.TripDto;
import com.sda.travelagency.service.TripService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api/trips")
public class TripController {

    public final TripService tripService;

    public final TripConverter tripConverter;

    public TripController(TripService tripService, TripConverter tripConverter) {
        this.tripService = tripService;
        this.tripConverter = tripConverter;
    }

    @GetMapping
    public List<TripDto> getAllTrips() {
        log.info("Getting all trips");

        var entities = tripService.findAllTrips();
        return entities.stream()
                .map(tripConverter::fromEntityToDto)
                .toList();
    }

    @GetMapping("/{id}")
    public TripDto getTripById(@PathVariable("id") Long id) {
        log.info("Getting the trip by ID: [{}]", id);

        var entity = tripService.getTripById(id);
        return tripConverter.fromEntityToDto(entity);
    }
}

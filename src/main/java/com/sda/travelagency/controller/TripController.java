package com.sda.travelagency.controller;


import com.sda.travelagency.entity.Trip;
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

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getAllTrips() {
        log.info("Getting all trips");

        return tripService.findAllTrips();
    }

    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable("id") Long id) {
        log.info("Getting the trip by ID: [{}]", id);
        return tripService.findById(id);
    }
}

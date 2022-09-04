package com.sda.travelagency.service;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.exception.TripNotFoundException;
import com.sda.travelagency.repository.TripRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAllTrips() {
        log.info("Finding all trips");
        return tripRepository.findAll();
    }

    public Trip getTripById(Long id) {
        log.info("Finding Trip by Id: [{}]", id);

        if (id != null) {
            throw new TripNotFoundException("No trip with id: " + id);
        }
        return null;
    }
}

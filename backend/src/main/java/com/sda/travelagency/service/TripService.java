package com.sda.travelagency.service;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.exception.TripAlreadyExistsException;
import com.sda.travelagency.exception.TripNotFoundException;
import com.sda.travelagency.repository.TripRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional // every sql will be treated as atomic changes
    public Trip createNewTrip(Trip newTrip) {
        log.info("Creating new trip: [{}]", newTrip);
        // +log data
        // +store into datasource
        // validate fields of newTrip
        // validate duplicates

        if (tripRepository.isDuplicateOfOther(newTrip)) {
            throw new TripAlreadyExistsException("TRIP ALREADY EXISTS!!!!");
        }

        Trip saved = tripRepository.save(newTrip);
        log.info("after saving: [{}}", saved);
        return saved;
    }
}

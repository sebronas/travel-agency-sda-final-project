package com.sda.travelagency.service;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.exception.TripNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class TripService {
    public List<Trip> findAllTrips() {
        log.info("Finding all trips");
        return Collections.emptyList();
    }

    public Trip getTripById(Long id) {
        log.info("Finding Trip by Id: [{}]", id);

        if (id != null) {
            throw new TripNotFoundException("No trip with id: " + id);
        }
        return null;
    }
}

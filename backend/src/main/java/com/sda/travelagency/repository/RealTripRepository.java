package com.sda.travelagency.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!develop")
public interface RealTripRepository extends TripRepository {

}

package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealTripRepository extends JpaRepository<Trip,Long> {

}

package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TripRepository extends JpaRepository<Trip, Long> {

    //TODO: finish
    default boolean isDuplicateOfOther(Trip trip) {
        return false;
    }

}

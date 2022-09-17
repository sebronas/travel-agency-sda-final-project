package com.sda.travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // for enabling TripService @Transactional
public class TravelAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);
    }

}


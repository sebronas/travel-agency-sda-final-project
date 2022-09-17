package com.sda.travelagency.repository;

import com.sda.travelagency.entity.*;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// TripRepository bean will be created only when "develop" profile is activated
// useful for development purposes
@Profile("develop")
@Repository
public class FakeTripRepository implements CrudRepository<Trip, Long> {

    @Override
    public <S extends Trip> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Trip> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Trip> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    //There was Iterable - but changed to List<Trip>
    @Override
    public List<Trip> findAll() {
        return List.of(
                Trip.builder()
                        .tripStartDate(LocalDate.now().plusDays(1))
                        .tripEndDate(LocalDate.now().plusDays(15))
                        .destination(new Destination(1L,"UK", "London", "Hilton"))
                        .tripPrice(new Price(BigDecimal.valueOf(499L), "EURO"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules(1L ,"", ""))
                        .paymentType(PaymentType.PAYPAL)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(1L, List.of(), List.of("bathroom", "bed", "swimming pool")))
                        .photos(List.of("https://fastly.4sqi.net/img/general/600x600/1376806605_Hc3gxR3iMMI5OKRpt7ook-zGGreT4XxgEapWx0wC844.jpg"))
                        .build(),
                Trip.builder()
                        .tripStartDate(LocalDate.now().plusDays(3))
                        .tripEndDate(LocalDate.now().plusDays(15))
                        .destination(new Destination(2L, "Thailand", "Bangkok", "Banyan Tree Bangkok"))
                        .tripPrice(new Price(BigDecimal.valueOf(1499L), "EURO"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules(2L, "",""))
                        .paymentType(PaymentType.CARD)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(2L, List.of(), List.of("Bed", "Swiming Pool", "Bathroom", "Parking")))
                        .photos(List.of("https://i.pinimg.com/originals/e2/56/27/e256274d9921a731f36f25fbcf200ea3.jpg"))
                        .build()
        );
    }

    @Override
    public Iterable<Trip> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Trip entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Trip> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

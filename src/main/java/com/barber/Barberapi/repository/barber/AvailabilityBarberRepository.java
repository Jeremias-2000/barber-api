package com.barber.Barberapi.repository.barber;

import com.barber.Barberapi.document.barber.AvailabilityBarber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityBarberRepository extends MongoRepository<AvailabilityBarber,String> {
}

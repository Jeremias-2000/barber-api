package com.barber.Barberapi.repository.barber;

import com.barber.Barberapi.document.barber.Barber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends MongoRepository<Barber,String> {
}

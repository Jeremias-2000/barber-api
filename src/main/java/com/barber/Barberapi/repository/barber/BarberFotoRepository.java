package com.barber.Barberapi.repository.barber;

import com.barber.Barberapi.document.barber.BarberFotos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberFotoRepository extends MongoRepository<BarberFotos,String>{
}

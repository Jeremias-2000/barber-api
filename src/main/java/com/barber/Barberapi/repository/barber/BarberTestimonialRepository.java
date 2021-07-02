package com.barber.Barberapi.repository.barber;

import com.barber.Barberapi.document.barber.BarberTestimonials;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberTestimonialRepository extends MongoRepository<BarberTestimonials,String> {
}

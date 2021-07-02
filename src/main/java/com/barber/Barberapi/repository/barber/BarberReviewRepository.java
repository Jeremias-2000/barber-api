package com.barber.Barberapi.repository.barber;

import com.barber.Barberapi.document.barber.BarberReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberReviewRepository extends MongoRepository<BarberReview,String> {
}

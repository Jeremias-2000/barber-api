package com.barber.Barberapi.repository;

import com.barber.Barberapi.document.NameService;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NameRepository extends MongoRepository<NameService,String> {
}

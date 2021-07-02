package com.barber.Barberapi.repository.user;

import com.barber.Barberapi.document.user.UserFavorite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFavoriteRepository extends MongoRepository<UserFavorite,String> {
}

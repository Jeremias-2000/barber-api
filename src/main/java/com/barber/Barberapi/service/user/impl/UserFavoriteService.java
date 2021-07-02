package com.barber.Barberapi.service.user.impl;

import com.barber.Barberapi.document.user.UserFavorite;
import com.barber.Barberapi.repository.user.UserFavoriteRepository;
import com.barber.Barberapi.service.user.AbstractUserFavorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFavoriteService implements AbstractUserFavorite<UserFavorite> {

    @Autowired
    private UserFavoriteRepository userFavoriteRepository;


    @Override
    public List<UserFavorite> findUsersFavorites() {
        return userFavoriteRepository.findAll();
    }

    @Override
    public UserFavorite createUserFavorite(UserFavorite favorite) {
        return userFavoriteRepository.save(favorite);
    }
}

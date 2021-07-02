package com.barber.Barberapi.service.user;

import java.util.List;

public interface AbstractUserFavorite<UF> {

    List<UF> findUsersFavorites();
    UF createUserFavorite(UF favorite);
}

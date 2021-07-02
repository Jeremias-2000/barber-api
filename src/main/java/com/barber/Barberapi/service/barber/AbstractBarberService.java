package com.barber.Barberapi.service.barber;

import java.util.List;

public interface AbstractBarberService<B> {

    List<B> findBarbers();
    B createBarber(B barber);

}

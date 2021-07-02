package com.barber.Barberapi.service.barber;

import java.util.List;

public interface AbstractBarberFotoService<BF> {

    List<BF> findBarberFotos();
    BF findBarberFotoById(String BarberFotoById);
    BF createBarberFoto(BF foto);
}

package com.barber.Barberapi.service.barber.impl;

import com.barber.Barberapi.document.barber.Barber;
import com.barber.Barberapi.repository.barber.BarberRepository;
import com.barber.Barberapi.service.barber.AbstractBarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberService implements AbstractBarberService<Barber> {


    @Autowired
    private BarberRepository barberRepository;

    @Override
    public List<Barber> findBarbers() {
        return barberRepository.findAll();
    }

    @Override
    public Barber createBarber(Barber barber) {
        return barberRepository.save(barber);
    }
}

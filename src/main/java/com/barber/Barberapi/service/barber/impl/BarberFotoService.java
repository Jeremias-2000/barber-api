package com.barber.Barberapi.service.barber.impl;

import com.barber.Barberapi.document.barber.BarberFotos;
import com.barber.Barberapi.repository.barber.BarberFotoRepository;
import com.barber.Barberapi.service.barber.AbstractBarberFotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberFotoService implements AbstractBarberFotoService<BarberFotos> {

    @Autowired
    private BarberFotoRepository barberFotoRepository;

    @Override
    public BarberFotos findBarberFotoById(String BarberFotoById) {
        return null;
    }

    @Override
    public List<BarberFotos> findBarberFotos() {
        return barberFotoRepository.findAll();
    }

    @Override
    public BarberFotos createBarberFoto(BarberFotos foto) {
        return barberFotoRepository.save(foto);
    }
}

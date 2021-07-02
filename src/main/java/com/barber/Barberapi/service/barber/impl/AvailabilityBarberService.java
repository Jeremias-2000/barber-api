package com.barber.Barberapi.service.barber.impl;

import com.barber.Barberapi.document.barber.AvailabilityBarber;
import com.barber.Barberapi.exception.AvailabilityNotFoundException;
import com.barber.Barberapi.repository.barber.AvailabilityBarberRepository;
import com.barber.Barberapi.service.barber.AbstractAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailabilityBarberService implements AbstractAvailabilityService<AvailabilityBarber> {

    @Autowired
    private AvailabilityBarberRepository availabilityBarberRepository;

    public AvailabilityBarberService(AvailabilityBarberRepository availabilityBarberRepository) {
        this.availabilityBarberRepository = availabilityBarberRepository;
    }


    @Override
    public List<AvailabilityBarber> Availability() {
        return availabilityBarberRepository.findAll();
    }

    @Override
    public AvailabilityBarber findAvailabilityById(String availabilityId) {
        return availabilityBarberRepository.findById(availabilityId).orElseThrow(() -> new AvailabilityNotFoundException(availabilityId));
    }

    @Override
    public AvailabilityBarber createAvailability(AvailabilityBarber availability) {
        return availabilityBarberRepository.save(availability);
    }

    @Override
    public AvailabilityBarber updateAvailability(String availabilityId, AvailabilityBarber availability) {
        return null;
    }

    @Override
    public void deleteAvailability(String availabilityId) {
        AvailabilityBarber  availability = findAvailabilityById(availabilityId);
        availabilityBarberRepository.delete(availability);
    }
}

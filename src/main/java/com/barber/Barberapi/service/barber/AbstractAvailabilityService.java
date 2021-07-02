package com.barber.Barberapi.service.barber;

import java.util.List;

public interface AbstractAvailabilityService<AB> {

    List<AB> Availability();
    AB createAvailability(AB availability);
    AB findAvailabilityById(String availabilityId);
    AB updateAvailability(String availabilityId,AB availability);
    void deleteAvailability(String availabilityId);
}

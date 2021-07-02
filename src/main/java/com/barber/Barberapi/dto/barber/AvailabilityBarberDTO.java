package com.barber.Barberapi.dto.barber;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvailabilityBarberDTO {

    private String availabilityBarberId;
    private String barberId;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataHour;
}

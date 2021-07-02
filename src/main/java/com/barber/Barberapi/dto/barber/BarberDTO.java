package com.barber.Barberapi.dto.barber;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BarberDTO {

    private String barberId;
    private String barberName;
    private String avatar;
    private float stars;
    private String latitude;
    private String longitude;
}

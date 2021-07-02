package com.barber.Barberapi.document.barber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class BarberTestimonials {

    @Id
    private String barberTestimonialsId;
    private String barberId;
    private String userName;
    private float rating;
    private String body;
}

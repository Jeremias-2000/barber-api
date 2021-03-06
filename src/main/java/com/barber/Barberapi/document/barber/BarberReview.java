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
public class BarberReview {

    @Id
    private String barberReviewId;
    private String barberId;
    private float rating;
}

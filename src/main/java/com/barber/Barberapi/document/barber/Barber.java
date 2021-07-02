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
public class Barber {

    @Id
    private String barberId;
    private String barberName;
    private String avatar;
    private float stars;
    private String latitude;
    private String longitude;
}

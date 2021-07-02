package com.barber.Barberapi.document.barber;

import javafx.scene.text.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class AvailabilityBarber {

    @Id
    private String availabilityBarberId;
    private String barberId;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataHour;


}

package com.barber.Barberapi.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Appointments {

    @Id
    private String appointmentId;
    private String userId;
    private String barberId;
    private String appointmentDate;

}

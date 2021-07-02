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
public class NameService {

    @Id
    private String nameServiceId;
    private String barberId;
    private String service;
    private float price;
}

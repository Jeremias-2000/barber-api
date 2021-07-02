package com.barber.Barberapi.document.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class UserFavorite {

    @Id
    private String userFavoriteId;
    private String userId;
    private String barberId;

}

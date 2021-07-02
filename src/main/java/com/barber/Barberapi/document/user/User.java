package com.barber.Barberapi.document.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userId;
    private String userName;
    private String avatar;
    private String email;
    private String password;
}

package com.barber.Barberapi.dto;

import com.barber.Barberapi.document.user.User;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private String userId;
    private String userName;
    private String avatar;
    private String email;
    private String password;

    public UserDTO (User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.avatar = user.getAvatar();
        this.email = user.getEmail();
        this.password = user.getPassword();

    }
}

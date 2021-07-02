package com.barber.Barberapi.service.user;

import com.barber.Barberapi.document.user.User;

import java.util.List;
import java.util.Optional;

public interface AbstractUserService<U> {
    List<U> findUsers();
    U createUser(U user);
    U updateUser(String userId,U dto);
    User convertToUser(U dto);

    U convertToUserDTO(User user);
    List<U> convertToListUserDTO(List<User> users);
    void deleteUserById(String UserId);
    void checkIfUserAlreadyExists(U dto);
    void checkIfItIsNotNull(Optional<U> dto);
}

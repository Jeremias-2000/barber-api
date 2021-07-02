package com.barber.Barberapi.exception;

import com.barber.Barberapi.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

import static java.lang.String.valueOf;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExceptionPerNullUser extends RuntimeException {
    public ExceptionPerNullUser(Optional<UserDTO> dto) {
        super(valueOf(dto));
    }
}

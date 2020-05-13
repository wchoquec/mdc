package com.everis.base.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author jovallep
 */
@Data
@Builder
public class Usuario {

    private String firstName;
    private String lastName;
    private String email;

    @Value("${usuario.password}")
    private String clave;

}

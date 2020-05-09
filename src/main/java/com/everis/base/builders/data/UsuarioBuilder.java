package com.everis.base.builders.data;

import com.everis.base.models.Usuario;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author jovallep
 */
public class UsuarioBuilder {

    private Usuario user;

    @Value("${usuario.password}")
    private String pass;

    public UsuarioBuilder() {
        user = Usuario.builder().build();

    }

    public static UsuarioBuilder unUsuario() {

        return new UsuarioBuilder();
    }

    public UsuarioBuilder conFullData() {
        this.user = Usuario.builder()
                .firstName("Jesus")
                .lastName("Ovalle")
                .email("jovallep@everis.com")
                .clave(pass)
                .build();
        return this;
    }

    public static UsuarioBuilder pero() {
        return new UsuarioBuilder();
    }
    // JESUS

    public UsuarioBuilder escribeNombre() {
        user.setFirstName("Jesus");
        return this;
    }

    public UsuarioBuilder escribeApellido() {
        user.setLastName("Ovalle");
        return this;

    }

    public UsuarioBuilder escribeEmail() {
        user.setEmail("jovallep@evers.com");
        return this;
    }

    public UsuarioBuilder escribeClave() {
        user.setClave(pass);
        return this;
    }


    public Usuario build() {
        return this.user;
    }

}

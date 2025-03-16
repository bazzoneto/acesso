package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Usuario;

public interface UsuarioServicePort {

    Usuario createUsuario(Usuario usuario);
}

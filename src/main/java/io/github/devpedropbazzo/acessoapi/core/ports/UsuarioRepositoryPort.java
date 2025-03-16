package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);

    public Usuario obtainByEmail(String email);
}

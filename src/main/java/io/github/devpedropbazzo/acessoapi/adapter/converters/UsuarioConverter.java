package io.github.devpedropbazzo.acessoapi.adapter.converters;

import io.github.devpedropbazzo.acessoapi.adapter.dtos.UsuarioDto;
import io.github.devpedropbazzo.acessoapi.core.domain.Pessoa;
import io.github.devpedropbazzo.acessoapi.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toTomain(UsuarioDto usuarioDto) {
        return new Usuario(usuarioDto.getId(),
                usuarioDto.getEmail(),
                usuarioDto.getSenha(),
                usuarioDto.getAdministrador(),
                new Pessoa(null, usuarioDto.getNome())
        );
    }

    public UsuarioDto toDto (Usuario usuario) {
        return new UsuarioDto(usuario.getId(), usuario.getPessoa().getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getAdministrador());
    }
}

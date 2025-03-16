package io.github.devpedropbazzo.acessoapi.adapter.repositories;

import io.github.devpedropbazzo.acessoapi.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository <UsuarioEntity, Long>{
    UsuarioEntity findByEmail(String email);
}

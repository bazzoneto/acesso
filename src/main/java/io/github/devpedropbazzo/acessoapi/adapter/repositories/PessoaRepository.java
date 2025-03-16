package io.github.devpedropbazzo.acessoapi.adapter.repositories;

import io.github.devpedropbazzo.acessoapi.adapter.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository  extends JpaRepository<PessoaEntity, Long> {
}

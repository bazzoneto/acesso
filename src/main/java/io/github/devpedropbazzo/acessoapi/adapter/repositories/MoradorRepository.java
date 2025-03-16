package io.github.devpedropbazzo.acessoapi.adapter.repositories;

import io.github.devpedropbazzo.acessoapi.adapter.entities.MoradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <MoradorEntity, Long>{
    MoradorEntity findByCpf(String cpf);
}

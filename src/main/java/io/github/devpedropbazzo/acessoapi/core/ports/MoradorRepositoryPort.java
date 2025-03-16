package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Morador;
import java.util.Collection;

public interface MoradorRepositoryPort {

    public Morador create(Morador morador);

    public Morador obtainByCpf(String cpf);

    public Collection<Morador> findAll();
}

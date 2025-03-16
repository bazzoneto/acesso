package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Visitante;
import java.util.Collection;
import java.util.Optional;

public interface VisitanteRepositoryPort {

    public Visitante create(Visitante visitante);

    public Optional<Visitante>  obtainByRg(String rg);

    Collection<Visitante> listAll();
}

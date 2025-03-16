package io.github.devpedropbazzo.acessoapi.core.services;

import io.github.devpedropbazzo.acessoapi.core.domain.Visitante;
import io.github.devpedropbazzo.acessoapi.core.exceptions.BusinessException;
import io.github.devpedropbazzo.acessoapi.core.ports.VisitanteRepositoryPort;
import io.github.devpedropbazzo.acessoapi.core.ports.VisitanteServicePort;
import java.util.Collection;

public class VisitanteService implements VisitanteServicePort {

    private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
    public Visitante createVisitante(Visitante visitante) {

        visitanteRepositoryPort.obtainByRg(visitante.getRg())
          .ifPresent(v -> {
              throw new BusinessException("Visitante já existe");
          });

        return visitanteRepositoryPort.create(visitante);
    }

    @Override
    public Visitante obtainByRg(String rg) {
        return visitanteRepositoryPort.obtainByRg(rg)
          .orElseThrow(() -> new IllegalArgumentException("Visitante não encontrado"));
    }

    @Override
    public Collection<Visitante> listAll() {
        return visitanteRepositoryPort.listAll();
    }

}

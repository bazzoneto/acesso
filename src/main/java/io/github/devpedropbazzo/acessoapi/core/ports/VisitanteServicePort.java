package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Visitante;
import java.util.Collection;

public interface VisitanteServicePort {
    Visitante createVisitante(Visitante visitante);

    Visitante obtainByRg(String rg);

    Collection<Visitante> listAll();
}

package io.github.devpedropbazzo.acessoapi.core.ports;

import io.github.devpedropbazzo.acessoapi.core.domain.Morador;
import java.util.Collection;

public interface MoradorServicePort {
    Morador createMorador(Morador morador);
    Collection<Morador> findAll();
}

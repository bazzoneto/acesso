package io.github.devpedropbazzo.acessoapi.infra;

import io.github.devpedropbazzo.acessoapi.core.ports.*;
import io.github.devpedropbazzo.acessoapi.core.services.MoradorService;
import io.github.devpedropbazzo.acessoapi.core.services.UsuarioService;
import io.github.devpedropbazzo.acessoapi.core.services.VisitanteService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServicePort(MoradorRepositoryPort moradorRepositoryPort) {
        return new MoradorService(moradorRepositoryPort);
    }

    @Bean
    public VisitanteServicePort visitanteServicePort(VisitanteRepositoryPort visitanteRepositoryPort) {
        return new VisitanteService(visitanteRepositoryPort);
    }
}

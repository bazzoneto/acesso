package io.github.devpedropbazzo.acessoapi.adapter.converters;

import io.github.devpedropbazzo.acessoapi.adapter.dtos.MoradorDto;
import io.github.devpedropbazzo.acessoapi.core.domain.Morador;
import io.github.devpedropbazzo.acessoapi.core.domain.Pessoa;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class MoradorConverter {

    /**
     * Converts MoradorDto to Morador domain object.
     * @param moradorDto the DTO to be converted.
     * @return the converted Morador domain object.
     */
    public Morador toDomain(MoradorDto moradorDto) {
        Objects.requireNonNull(moradorDto, "MoradorDto must not be null");

        return new Morador(
                moradorDto.getId(),
                moradorDto.getCpf(),
                moradorDto.getEndereco(),
                moradorDto.getCelular(),
                new Pessoa(null, moradorDto.getNome())
        );
    }

    /**
     * Converts Morador domain object to MoradorDto.
     * @param morador the domain object to be converted.
     * @return the converted MoradorDto.
     */
    public MoradorDto toDto(Morador morador) {
        Objects.requireNonNull(morador, "Morador must not be null");

        return new MoradorDto(
                morador.getId(),
                morador.getPessoa().getNome(),
                morador.getCpf(),
                morador.getEndereco(),
                morador.getCelular()
        );
    }
}
package io.github.devpedropbazzo.acessoapi.adapter.controllers;

import io.github.devpedropbazzo.acessoapi.adapter.converters.MoradorConverter;
import io.github.devpedropbazzo.acessoapi.adapter.dtos.MoradorDto;
import io.github.devpedropbazzo.acessoapi.core.domain.Morador;
import io.github.devpedropbazzo.acessoapi.core.ports.MoradorServicePort;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDto create(@RequestBody MoradorDto moradorDto) {
        Morador novoMorador = moradorServicePort.createMorador(moradorConverter.toTomain(moradorDto));
        return moradorConverter.toDto(novoMorador);
    }

    @GetMapping
    public Collection<MoradorDto>  findAll() {
        return moradorServicePort.findAll()
          .stream()
          .map(moradorConverter::toDto)
          .toList();
    }
}

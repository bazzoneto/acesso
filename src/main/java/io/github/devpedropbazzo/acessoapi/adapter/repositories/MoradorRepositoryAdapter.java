package io.github.devpedropbazzo.acessoapi.adapter.repositories;

import io.github.devpedropbazzo.acessoapi.adapter.entities.MoradorEntity;
import io.github.devpedropbazzo.acessoapi.core.domain.Morador;
import io.github.devpedropbazzo.acessoapi.core.ports.MoradorRepositoryPort;

import java.util.Collection;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

    private final MoradorRepository moradorRepository;
    private final PessoaRepositoryAdapter pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
        entity.setPessoaEntity(pessoaRepository.createPessoa(morador.getPessoa()));
        MoradorEntity novoMorador = moradorRepository.save(entity);
        return modelMapper.map(novoMorador, Morador.class);
    }

    @Override
    public Morador obtainByCpf(String cpf) {
        MoradorEntity moradoByCpf = moradorRepository.findByCpf(cpf);
        if (moradoByCpf == null) {
            return null;
        }
        return modelMapper.map(moradoByCpf, Morador.class);
    }

    @Override
    public Collection<Morador> findAll() {
        return moradorRepository.findAll()
          .stream()
          .map(moradorEntity -> modelMapper.map(moradorEntity, Morador.class))
          .toList();
    }

}

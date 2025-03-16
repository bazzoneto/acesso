package io.github.devpedropbazzo.acessoapi.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoradorDto {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
}

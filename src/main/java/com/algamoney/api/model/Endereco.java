package com.algamoney.api.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {

    @NotNull
    @Size(min = 3, max = 30)
    private String logradouro;
    @NotNull
    @Size(min = 3, max = 20)
    private String numero;
    @NotNull
    @Size(min = 3, max = 30)
    private String complemento;
    @NotNull
    @Size(min = 3, max = 30)
    private String bairro;
    @NotNull
    @Size(min = 3, max = 30)
    private String cep;
    @NotNull
    @Size(min = 3, max = 30)
    private String cidade;
    @NotNull
    @Size(min = 3, max = 30)
    private String estado;

    @NotNull
    private boolean ativo;
}

package com.br.med.voll.api.domain.medico;

import com.br.med.voll.api.domain.endereco.Endereco;

public record DadosDetalheMedico(Long id, String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {

    public DadosDetalheMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }
}

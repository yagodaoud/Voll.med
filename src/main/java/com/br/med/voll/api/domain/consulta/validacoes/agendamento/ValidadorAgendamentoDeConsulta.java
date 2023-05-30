package com.br.med.voll.api.domain.consulta.validacoes.agendamento;


import com.br.med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);

}
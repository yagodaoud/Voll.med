package com.br.med.voll.api.domain.consulta.validacoes.agendamento;

import com.br.med.voll.api.domain.ValidacaoException;
import com.br.med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia {

    public void Validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaEmMinutos < 30){
            throw new ValidacaoException("Conuslta deve ser agendada com atencedência mínima de 30 minutos");
        }
    }

}

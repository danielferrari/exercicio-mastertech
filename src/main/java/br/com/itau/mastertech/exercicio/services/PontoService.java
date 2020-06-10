package br.com.itau.mastertech.exercicio.services;

import br.com.itau.mastertech.exercicio.dtos.PontoSimples;
import br.com.itau.mastertech.exercicio.dtos.PontoUsuario;
import br.com.itau.mastertech.exercicio.helpers.PontoHelper;
import br.com.itau.mastertech.exercicio.models.Ponto;
import br.com.itau.mastertech.exercicio.repositories.PontoRepository;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class PontoService {
    @Autowired
    private PontoRepository pontoRepository;

    public PontoUsuario getAllByUserId(Integer userId) {
        List<PontoSimples> marcacoesPonto = StreamSupport.stream(
                pontoRepository.findAllByUserId(userId).spliterator(), true
        ).map(ponto -> {
                    return new PontoSimples(
                            ponto.getId(),
                            ponto.getTipo(),
                            ponto.getDataHora()
                    );
                }
        ).collect(Collectors.toList());

        return new PontoUsuario(
                marcacoesPonto,
                PontoHelper.getTotalHorasTrabalhadas()
        );

    }

    public Ponto create(Ponto ponto) {
        return pontoRepository.save(ponto);
    }
}

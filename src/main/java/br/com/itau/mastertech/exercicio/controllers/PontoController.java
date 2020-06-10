package br.com.itau.mastertech.exercicio.controllers;

import br.com.itau.mastertech.exercicio.dtos.PontoSimples;
import br.com.itau.mastertech.exercicio.dtos.PontoUsuario;
import br.com.itau.mastertech.exercicio.models.Ponto;
import br.com.itau.mastertech.exercicio.services.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class    PontoController {
    @Autowired
    private PontoService pontoService;

    @PostMapping("/ponto")
    @ResponseStatus(HttpStatus.CREATED)
    public Ponto create(@Valid @RequestBody Ponto ponto) {
        return pontoService.create(ponto);
    }

    @GetMapping("/ponto/buscarPorUsuario/{userId}")
    public PontoUsuario getALlByUserId(@PathVariable("userId") Integer userId) {
        return pontoService.getAllByUserId(userId);
    }
}

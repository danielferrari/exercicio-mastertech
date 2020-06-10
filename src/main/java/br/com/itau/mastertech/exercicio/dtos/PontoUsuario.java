package br.com.itau.mastertech.exercicio.dtos;

import java.util.List;

public class PontoUsuario {
    private List<PontoSimples> marcacoesPonto;
    private long horasTrabalhadas;

    public PontoUsuario() {

    }

    public PontoUsuario(List<PontoSimples> marcacoesPonto, long horasTrabalhadas) {
        this.marcacoesPonto = marcacoesPonto;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public List<PontoSimples> getMarcacoesPonto() {
        return marcacoesPonto;
    }

    public void setMarcacoesPonto(List<PontoSimples> marcacoesPonto) {
        this.marcacoesPonto = marcacoesPonto;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}

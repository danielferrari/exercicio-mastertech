package br.com.itau.mastertech.exercicio.dtos;

import br.com.itau.mastertech.exercicio.models.Ponto;
import br.com.itau.mastertech.exercicio.models.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import java.time.LocalDate;
import java.util.List;

public class PontoSimples {
    private Integer id;
    private String tipo;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime dataHora;

    public PontoSimples(Integer id, String tipo, LocalDateTime dataHora) {
        this.id = id;
        this.tipo = tipo;
        this.dataHora = dataHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

}

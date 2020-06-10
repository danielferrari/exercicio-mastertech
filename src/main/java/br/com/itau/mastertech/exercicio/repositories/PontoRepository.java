package br.com.itau.mastertech.exercicio.repositories;

import br.com.itau.mastertech.exercicio.models.Ponto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PontoRepository extends CrudRepository<Ponto, Integer> {
    @Query(value = "SELECT * FROM ponto WHERE id_usuario = ?1", nativeQuery = true)
    Iterable<Ponto> findAllByUserId(Integer id);
}

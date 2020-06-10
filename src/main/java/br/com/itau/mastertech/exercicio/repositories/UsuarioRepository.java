package br.com.itau.mastertech.exercicio.repositories;

import br.com.itau.mastertech.exercicio.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}

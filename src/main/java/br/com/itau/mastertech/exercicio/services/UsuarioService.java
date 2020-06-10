package br.com.itau.mastertech.exercicio.services;

import br.com.itau.mastertech.exercicio.models.Usuario;
import br.com.itau.mastertech.exercicio.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> get(Integer id) {
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> update(Integer id, Usuario usuario) {
        return usuarioRepository
                .findById(id)
                .map(usuarioUpdate -> {
                    usuario.setId(id);
                    return usuarioRepository.save(usuario);
                });
    }

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}

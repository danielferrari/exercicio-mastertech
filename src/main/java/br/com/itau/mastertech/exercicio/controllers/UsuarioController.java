package br.com.itau.mastertech.exercicio.controllers;

import javax.validation.Valid;

import br.com.itau.mastertech.exercicio.models.Usuario;
import br.com.itau.mastertech.exercicio.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@Valid @RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }

    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> update(@PathVariable("id") Integer id, @Valid @RequestBody Usuario usuario) {
        return usuarioService.update(id, usuario)
                .map(usuarioResponse -> ResponseEntity.ok().body(usuarioResponse))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> get(@PathVariable("id") Integer id) {
        return usuarioService.get(id)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/usuarios")
    public Iterable<Usuario> getAll() {
        return usuarioService.getAll();
    }
}

package com.sena.gane.controllers;

import com.sena.gane.model.entities.Usuario;
import com.sena.gane.services.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/listar-usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioServicio.findAll();
    }

    @GetMapping("/{idUSuario}")
    public Usuario obtenerUsuario(@PathVariable int idUsuario) {
        return usuarioServicio.findById(idUsuario).get();
    }

    @PostMapping("/crear-usuario")
    public Usuario crearUSuario(@RequestBody Usuario usuario) {
        return usuarioServicio.create(usuario);
    }

    @PutMapping("/editar-usuario/{idUsuario}")
    public void editarUsuario(@RequestBody Usuario usuario, @PathVariable int idUsuario) {
        usuarioServicio.update(usuario, idUsuario);
    }

    @DeleteMapping("/eliminar-usuario")
    public void eliminarUsuario(@PathVariable int idUsuaurio) {
        usuarioServicio.delete(idUsuaurio);
    }
}

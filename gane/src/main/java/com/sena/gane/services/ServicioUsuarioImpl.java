package com.sena.gane.services;

import com.sena.gane.model.entities.Usuario;
import com.sena.gane.model.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuarioImpl implements IUsuarioServicio{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Optional<Usuario> findById(int id) {
        return usuarioRepositorio.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void update(Usuario usuario, int id) {
        Usuario usuarioEncontrado = usuarioRepositorio.findById(id).get();
        usuarioEncontrado.setNombre(usuario.getNombre());
        usuarioEncontrado.setApellidos(usuario.getApellidos());
        usuarioEncontrado.setTipoDocumento(usuario.getTipoDocumento());
        usuarioEncontrado.setnDocumento(usuario.getnDocumento());
        usuarioEncontrado.setFechaNacimiento(usuario.getFechaNacimiento());
        usuarioEncontrado.setEdad(usuario.getEdad());
        usuarioEncontrado.setCorreo(usuario.getCorreo());
        usuarioEncontrado.setContrasenia(usuario.getContrasenia());
        usuarioEncontrado.setRole(usuario.getRole());
        usuarioRepositorio.save(usuarioEncontrado);
    }

    @Override
    public void delete(int id) {
        Usuario usuarioEncontrado = usuarioRepositorio.findById(id).get();
        usuarioRepositorio.delete(usuarioEncontrado);
    }
}

package com.sena.gane.services;

import com.sena.gane.model.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioServicio {
    Optional<Usuario> findById(int id);
    List<Usuario> findAll();
    Usuario create(Usuario usuario);
    void update(Usuario usuario, int id);
    void delete(int id);

}

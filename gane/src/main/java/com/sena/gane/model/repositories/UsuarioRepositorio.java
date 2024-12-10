package com.sena.gane.model.repositories;

import com.sena.gane.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}

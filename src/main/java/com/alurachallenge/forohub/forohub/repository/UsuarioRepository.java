package com.alurachallenge.forohub.forohub.repository;

import com.alurachallenge.forohub.forohub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByNombre(String nombre);

    UserDetails findByEmail(String email);
}

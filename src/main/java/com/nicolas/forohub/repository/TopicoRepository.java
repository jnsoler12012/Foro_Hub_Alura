package com.nicolas.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.forohub.model.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
}

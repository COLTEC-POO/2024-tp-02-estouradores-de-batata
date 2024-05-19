package com.bibliotec.bibliotec.repository;

import com.bibliotec.bibliotec.model.Morador;
import com.bibliotec.bibliotec.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository<Morador, Long> {
}

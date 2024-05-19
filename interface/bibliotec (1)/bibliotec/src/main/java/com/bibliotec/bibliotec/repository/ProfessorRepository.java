package com.bibliotec.bibliotec.repository;

import com.bibliotec.bibliotec.model.Professor;
import com.bibliotec.bibliotec.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

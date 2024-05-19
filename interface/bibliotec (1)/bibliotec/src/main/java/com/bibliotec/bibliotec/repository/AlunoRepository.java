package com.bibliotec.bibliotec.repository;

import com.bibliotec.bibliotec.model.Aluno;
import com.bibliotec.bibliotec.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}

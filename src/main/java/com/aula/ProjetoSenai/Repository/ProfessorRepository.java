package com.aula.ProjetoSenai.Repository;

import com.aula.ProjetoSenai.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

package com.aula.ProjetoSenai.Repository;

import com.aula.ProjetoSenai.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {
}

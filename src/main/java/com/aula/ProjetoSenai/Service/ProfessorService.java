package com.aula.ProjetoSenai.Service;

import com.aula.ProjetoSenai.Model.Professor;
import com.aula.ProjetoSenai.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    // Inserir (Create)
    public Professor salvarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    // Buscar todos (Read)
    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    // Buscar por ID (Read)
    public Optional<Professor> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }

    // Atualizar (Update)
    public Professor atualizarProfessor(Long id, Professor professorAtualizado) {
        return professorRepository.findById(id)
                .map(professor -> {
                    professor.setNome(professorAtualizado.getNome());
                    professor.setDisciplina(professorAtualizado.getDisciplina());
                    return professorRepository.save(professor);
                })
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: " + id));
    }

    // Deletar (Delete)
    public void deletarProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}

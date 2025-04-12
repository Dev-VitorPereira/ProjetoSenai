package com.aula.ProjetoSenai.Service;

import com.aula.ProjetoSenai.Model.Aluno;
import com.aula.ProjetoSenai.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;


    //Metodo cadastrar alunos
    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    //Metodo buscar todos alunos
    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }

    //Buscar por Id
    public Optional<Aluno> buscarId(Long id){
        return alunoRepository.findById(id);
    }
    //deletar
    public void deletar(Long id){
        alunoRepository.deleteById(id);
    }

    //atualizar
    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        return alunoRepository.findById(id)
                .map(aluno -> {
                    aluno.setNome(alunoAtualizado.getNome());
                    aluno.setIdade(alunoAtualizado.getIdade());
                    aluno.setMatricula(alunoAtualizado.getMatricula());
                    return alunoRepository.save(aluno);
                })
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o ID: " + id));
    }
}

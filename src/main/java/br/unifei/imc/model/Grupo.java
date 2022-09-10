package br.unifei.imc.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private List<Aluno> alunos;
    private Double nota;

    public Grupo(final List<Aluno> alunos, final Double nota) {
        this.alunos = new ArrayList<>();
        this.nota = nota;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(final List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(final Double nota) {
        this.nota = nota;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
}

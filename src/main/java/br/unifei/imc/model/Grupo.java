package br.unifei.imc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grupo {

    private List<Aluno> alunos;
    private Double nota;

    public Grupo() {
        this.alunos = new ArrayList<>();
        this.nota = null;
    }

    public static List<Aluno> convertGrouposAlunos(List<Grupo> grupos){
        List<Aluno> alunosHash = new ArrayList<>();

        grupos.forEach(grupo -> {
            grupo.getAlunos().forEach(aluno -> {
                alunosHash.add(aluno);
            });
        });

        return alunosHash;
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
        alunos.stream().forEach(aluno -> {
            aluno.setNota(nota.toString());
        });
        this.nota = nota;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}

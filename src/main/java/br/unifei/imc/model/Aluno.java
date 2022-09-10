package br.unifei.imc.model;

import br.unifei.imc.utils.CsvFile;
import com.sun.jdi.DoubleValue;

import java.util.List;

public class Aluno {

    private String matricula;
    private String nome;

    private double nota;

    public Aluno() {
    }
    public Aluno(final String matricula, final String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String printInfos(){
        return String.format(this.nome + " | " + this.matricula);
    }

    public static void listStudents(List<Aluno> alunos) {
        alunos.forEach(aluno -> System.out.println(aluno.printInfos()));
    }

    public void setNota(String nota) {
        this.nota = Double.parseDouble(nota);
    }

    public Double getNota() {
        return this.nota;
    }
}

package br.unifei.imc.model;

public class Aluno {

    private String matricula;
    private String nome;

    public Aluno(final String matricula, final String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    //mostrar listas de alunos

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
}

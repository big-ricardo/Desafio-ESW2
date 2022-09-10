package br.unifei.imc.model;

import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    public static void criarGrupoHandler(List<Aluno> alunos, List<Grupo> grupos, Grupo grupo, String matricula) {
        List<Aluno> alunoFiltered = alunos.stream().filter(aluno -> aluno.getMatricula().equals(matricula)).collect(Collectors.toList());
        if (alunoFiltered.size() > 0) {
            grupo.addAluno(alunoFiltered.get(0));
        } else {
            System.out.println("Matricula não encontrada");
        }
    }
}

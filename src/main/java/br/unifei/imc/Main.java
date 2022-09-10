package br.unifei.imc;

import br.unifei.imc.model.Aluno;
import br.unifei.imc.model.Grupo;
import br.unifei.imc.model.Menu;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos;
        List<Grupo> grupos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Sistema de gerenciador de grupos");

        System.out.println("Digite o nome e diretorio do arquivo CSV:");
        String path = scanner.nextLine();



        do{
            System.out.println("1- Listar lista de alunos");
            System.out.println("2- Listar lista de grupos");
            System.out.println("3- Criar grupo");
            System.out.println("4- Exportar dados no arquivo");

            System.out.println("Selecione uma opção:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Listar lista de alunos");

                    break;
                case 2:
                    System.out.println("Listar lista de grupos");
                    break;
                case 3:
                    System.out.println("Criar grupo");
                    var grupo = new Grupo();
                    String matricula;
                    do{
                        System.out.println("Digite a matricula do aluno:");
                        matricula = scanner.nextLine();
                        Menu.criarGrupoHandler(alunos, grupos, grupo, matricula);
                    } while ( matricula != "0" );
                    break;
                case 4:
                    System.out.println("Exportar dados no arquivo");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (true);

    }
}

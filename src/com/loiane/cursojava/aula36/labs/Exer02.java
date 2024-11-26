package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nome = scan.nextLine();

        System.out.println("Entre com o horário do curso");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o departamento do professor");
        String departamentoProf = scan.nextLine();

        System.out.println("Entre com o e-mail do professor");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamentoProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("=== Alunos ===");
        Aluno[] alunos = new Aluno[5];
        for(int i = 0; i < 5; i++){
            scan.nextLine();
            System.out.println("Entre com o nome do Aluno " + (i+1));
            String nomeAluno = scan.nextLine();
            System.out.println("Entre com a matricula do Aluno");
            String matricula = scan.nextLine();

            double[] notas = new double[4];

            for(int j = 0; j < 4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}

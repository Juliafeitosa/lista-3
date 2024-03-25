//1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteveno semestre. No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + calcularMedia());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        aluno.mostrarDetalhes();

        scanner.close();
    }
}
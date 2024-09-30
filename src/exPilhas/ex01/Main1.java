package exPilhas.ex01;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Pilha par = new Pilha(10);
        Pilha impar = new Pilha(10);


        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Digite um número inteiro: ");
            int num = scanner.nextInt();

            if (num == 0){
                Integer desempilhado = -par.desempilhar();
                if (desempilhado == null){
                    System.out.println("Pilha par vazia");
                }else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }
                desempilhado = impar.desempilhar();
                if (desempilhado == null){
                    System.out.println("Pilha ímpar vazia");
                }else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhado);
                }
            }

            else if(num % 2 == 0){
                System.out.println("Empilhando o número na pilha par: " + num);
                par.empilhar(num);
            }else{
                System.out.println("Empilhando o número na pilha ímpar: " + num);
                impar.empilhar((num));
            }
        }
        System.out.println("Desempilhando todos os números da pilha par:");
        while (!par.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha par: " + par.desempilhar());
        }
        System.out.println("Desempilhando todos os números da pilha ímpar:");
        while (!impar.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha ímpar: " + impar.desempilhar());
        }
        System.out.println("Todos os elementos foram desempilhados.");
    }
}

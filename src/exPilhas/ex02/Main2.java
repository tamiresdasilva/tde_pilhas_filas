package exPilhas.ex02;

public class Main2 {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("Maria");
        imprimeResultado("Ana");
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Pilha pilha = new Pilha(palavra.length());
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(String.valueOf(palavra.charAt(i)));
        }

        String palavraReversa = "";
        while (!pilha.estaVazia()) {
            palavraReversa += pilha.desempilhar();
        }
        return palavraReversa.equalsIgnoreCase(palavra);
    }
}
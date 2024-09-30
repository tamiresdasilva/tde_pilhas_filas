package exPilhas.ex03;

public class Main3 {
    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("A + B + C - D)");
    }
    final static String ABRE = "(";
    final static String FECHA = ")";

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado? " + verificaParentesesBalenceados(expressao));
    }
    public static boolean verificaParentesesBalenceados(String expressao){

        boolean balanceado = true;
        Pilha pilha = new Pilha(expressao.length());
        int index = 0;
        String simbolo, topo;

        while (index < expressao.length()){
            simbolo = String.valueOf(expressao.charAt(index));

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilhar(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazia()){
                    return false;
                }else {
                    topo = pilha.desempilhar();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }
}

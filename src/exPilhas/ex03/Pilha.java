package exPilhas.ex03;

public class Pilha {
    private String [] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public  boolean estaCheia(){
        return this.tamanho == this.elementos.length;
    }

    public boolean empilhar(String e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho++;
            return true;
        }
        return false;
    }

    public String desempilhar(){
        if(!estaVazia()){
            String elementoRemovido = this.elementos[tamanho - 1];
            this.tamanho --;
            return elementoRemovido;
        }
        return null;
    }

    public String espiar(){
        if(!estaVazia()){
            return this.elementos[tamanho - 1];
        }
        return null;
    };


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}


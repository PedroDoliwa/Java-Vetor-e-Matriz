package Vetores;

public class Vetor {
    private String[] elementos;
    private int posicaoAtual;

    public Vetor(int capacidade) {          // construtor
        elementos = new String[capacidade];
        posicaoAtual = 0;
    }

    public void inserir(String elemento) {      // metodo inserir no final do vetor
        if (posicaoAtual < this.elementos.length) {
            elementos[posicaoAtual] = elemento;
            posicaoAtual++;
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void inserirIndice(int indice, String elemento) {

        for (int i = posicaoAtual-1; i >=indice ; i--) {
            elementos[i+1] = elementos[i];
        }
        elementos[indice] = elemento;
        posicaoAtual++;
    }

    public String retornarValor(int indice) {
        return elementos[indice];
    }


    public void alterar(int indice, String elemento) {  // metodo alterar elemento pelo indice
        if (indice > -1 && indice < posicaoAtual) {
            elementos[indice] = elemento;
        } else {
            System.out.println("Indice inválido");
        }
    }

    public void excluir(int indice){        // metodo excluir elemento pelo indice
        //this.elementos[indice] = null;
        boolean alterado = false;
        for(int i = 0; i < posicaoAtual; i++){
            if(i == indice) {
                elementos[i] = elementos[i + 1];
                alterado = true;
            }
        }
        if(alterado){
            System.out.println("excluido");
            posicaoAtual--;
        }

    }

    public void excluir(String elemento){        // metodo excluir elemento pelo nome
        boolean alterado = false;
        for(int i = 0; i < posicaoAtual; i++){
            if(this.elementos[i].equals(elemento)){
                elementos[i] = elementos[i+1];
                alterado = true;
            }
        }
        if(alterado){
            posicaoAtual--;
        }
    }


    public void existe(String elemento) {    // metodo verificar se existe o elemento no vetor
        for (int i = 0; i < posicaoAtual; i++) {
            if (this.elementos[i].equals(elemento)) {
                System.out.println("Existe " + elemento);
                break;
            }else{
                System.out.println("Nao existe " + elemento);
                break;
            }
        }
    }

    public int tamanhoAtual(){      // metodo quantidade de elementos dentro do vetor
        return posicaoAtual;
    }

    public void aumentaCapacidade(){        // metodo aumentar capacidade do vetor
        String[] novoVetor;
        novoVetor = new String[this.elementos.length * 2];

        for (int i = 0; i < posicaoAtual; i++) {
            if (elementos[i] != null) {
                novoVetor[i] = elementos[i];
            }else{
                break;
            }
        }
        System.out.println("Capacidade do Vetor: "+ novoVetor.length);
    }

    public void vazio(){        // metodo para saber se o vetor esta vazio
        int quantidade=0;
        for (int i = 0; i < posicaoAtual; i++) {
            if(this.elementos[i] != null) {
                quantidade++;
            }
        }
        if(quantidade==0){
            System.out.println("Vetor Vazio");
        }else{
            System.out.println("Vetor não está Vazio");
        }
    }

    public void limpar(){
        posicaoAtual =-1;
        System.out.println("Vetor Limpo");
    }

    @Override
    public String toString() {      // metodo sobre escrito do to string
        String str ;
        str = "{";

        for (int i = 0; i < posicaoAtual; i++) {
            str += elementos[i];
            if(i < posicaoAtual - 1){
                str += ",";
            }
        }
        str += "}";
        return str;
    }
}





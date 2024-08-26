package Vetores;

public class Teste {
    public static void main(String[] args) {

            Vetor frutas = new Vetor(5);
            frutas.inserir("Maçã");
            frutas.inserir("Abacaxi");

            frutas.inserirIndice(0, "Pera");

            frutas.retornarValor(1);

            frutas.alterar(0,"Morango");

            frutas.excluir(1);

            frutas.excluir("Banana");

            frutas.existe("Morango");

            System.out.println(frutas.tamanhoAtual());

            frutas.aumentaCapacidade();

            frutas.vazio();

            //frutas.limpar();

            System.out.println(frutas);
    }
}

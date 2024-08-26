package Matriz;

public class Teste {
        public static void main(String[] args) {

                int [][] dados = {
                        {1,10,1},
                        {2,0,0},
                        {3,0,0}
                };

                Matriz matriz = new Matriz(dados);

                matriz.obterMaiorValor();
                matriz.obterMenorValor();
                matriz.media();
                matriz.somarLinhas();
                matriz.somarColuna();
                System.out.println(matriz.somaTotal());
                System.out.println(matriz.contarOcorrencias(10));
                System.out.println(matriz.toString());
        }
}

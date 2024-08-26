package Matriz;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void obterMaiorValor(){
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] > maior) {
                    maior = matriz[j][i];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }

    public void obterMenorValor(){
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] < menor) {
                    menor = matriz[j][i];
                }
            }
        }
        System.out.println("Menor valor: " + menor);
    }

    public void media() {
        float soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[j][i];
            }
        }
        System.out.println("Media Aritmetica: " + soma/matriz.length);
    }

    public void somarLinhas() {
        int[] somaLinha = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            somaLinha[i] = soma;
            System.out.println("Linha "+i+": "+somaLinha[i]);
        }
    }

    public void somarColuna() {
        int colunas = matriz[0].length;
        int[] somaColuna = new int[colunas];
        for (int i = 0; i < colunas; i++) {
            int soma = 0;
            for (int[] linha : matriz) {
                soma += linha[i];
            }
            somaColuna[i] = soma;
            System.out.println("Coluna "+i+": "+somaColuna[i]);
        }
    }

    public int somaTotal() {
        int somaTotal = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                somaTotal += elemento;
            }
        }
        return somaTotal;
    }

    public int contarOcorrencias(int valor) {
        int contagem = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento == valor) {
                    contagem++;
                }
            }
        }
        return contagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                sb.append(elemento).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


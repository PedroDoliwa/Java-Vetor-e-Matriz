//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] inteiros = new int[10];

        inteiros[0] = 1;
        inteiros[1] = 2;

        int[] numeros = {5,6,7,8,9,10};

        for (int i=0; i<numeros.length; i++){

            System.out.println(numeros[i]);
        }

        int [][] matriz = new int[3][3];
        matriz[0][2] = 30;
        System.out.println(matriz[0][2]);

        int [][] matriz2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };





    }
}
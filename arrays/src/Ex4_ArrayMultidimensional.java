/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();

        // criando uma array multidimensional (matriz quadrada 4 x 4)
        int[][] M = new int[4][4];

        // Imprimi número de linhas da array
        System.out.println("M_linhas: " + M.length);

        // Imprimi número de colunas da array
        System.out.println("M_colunas: " + M[0].length);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                M[i][j] = random.nextInt(10);

            }
        }
        System.out.println("Matriz M: ");
        for (int[] linha : M) {
            for (int elementoLinhaColuna : linha) {
                System.out.print(elementoLinhaColuna + " ");
            }
            System.out.println();
        }

        System.out.println("Elementos M[i][j]: ");
        for (int i = 0; i < M.length; ++i) {
            for (int j = 0; j < M[i].length; ++j) {
                System.out.println("M[" + i + "][" + j + "]: " + M[i][j]);
            }
        }
    }
}

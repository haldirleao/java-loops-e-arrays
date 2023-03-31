/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };
        // LEMBRE-SE int[0] é a primeira posição do vetor,
        // assim, nete caso, int[0] = -5.

        System.out.println("----TESTES PRELIMINARES ---");

        // Para saber mais:
        // https://www.freecodecamp.org/portuguese/news/metodos-de-arrays-em-java-como-imprimir-um-array-em-java/
        System.out.println("Note que desta forma retorna \"nome_da_classe@hash_code do objeto\":\n" + vetor);

        // for-each para retornar os elementos do array.
        System.out.println("Vetor (usando for-each): ");
        for (int i : vetor)
            System.out.print(i + " ");

        // while para retornar os elementos do array.
        System.out.println("\nVetor (usando while): ");
        int i = 0;
        while (i < vetor.length) {
            System.out.print(vetor[i] + " ");
            i++;
        }

        System.out.println("\n----RESPOSTA DO EXERCÍCIO---");

        // for para retornar os elementos do array na ordem invertida.
        System.out.println("Vetor invertido (usando for): ");
        for (int j = (vetor.length - 1); j >= 0; j--)
            System.out.println("vetor[" + j + "] = " + vetor[j]);

        for (int j = (vetor.length - 1); j >= 0; j--)
            System.out.print(vetor[j] + " ");

    }
}

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int qtdeNumeros;
            int numero;
            int qtdePares = 0, qtdeImpares = 0;

            System.out.println("Quantidade de números: ");
            qtdeNumeros = scan.nextInt();

            int count = 0;

            do {
                System.out.println("Digite um número inteiro:");
                numero = scan.nextInt();

                if (numero % 2 == 0)
                    ++qtdePares;
                else
                    ++qtdeImpares;

                ++count;

            } while (count < qtdeNumeros);

            System.out.println("Total de núm. pares:" + qtdePares);
            System.out.println("Total de núm. ímpares:" + qtdeImpares);
        }

    }
}

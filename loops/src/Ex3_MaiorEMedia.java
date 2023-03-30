import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            double numero;
            double maior = 0;
            double soma = 0;
            int count = 0;

            do {
                System.out.println("Digite um número: ");
                numero = scan.nextDouble(); // Se ocorrer o erro "InputMismatchException", teste com "," e "." como
                                            // separador decimal.
                soma += numero;

                if (numero > maior)
                    maior = numero;

                count += 1;
            } while (count < 5);

            System.out.println("Maior número: " + maior);
            System.out.println("Média: " + soma / count);
        }
    }
}

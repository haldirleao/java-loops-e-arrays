import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
Nota: A leitura via teclado será de uma letra por vez.
*/

public class Ex2_Consoantes {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            // ATENÇÃO: O tamanho do objeto array instanciado deve ser fixo, e definido na
            // sua criação.
            String[] consoantes = new String[6]; // definido array de 6 elementos.

            int qtdeConsoantes = 0;

            int count = 0;
            do {
                System.out.println("Digite uma letra: ");
                String letra = scan.nextLine();

                if (!(letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    qtdeConsoantes++;
                }
                count++;
            } while (count < consoantes.length);

            // for-each
            System.out.println("Array completo: ");
            for (String consoante : consoantes) {
                System.out.print(consoante + " ");
            }
            // for-each
            System.out.println("\nConsoantes: ");
            for (String consoante : consoantes) {

                if (consoante != null)
                    System.out.print(consoante + " ");
            }

            System.out.println("\nQuantidade de consoantes: " + qtdeConsoantes);
        }

    }

}

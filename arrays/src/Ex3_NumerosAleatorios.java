import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números, e seus antecessores e sucessores.
*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random =  new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length ; i++){            
            int numero = random.nextInt(101);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios (entre 0 e 100): ");
        for (int i : numerosAleatorios) System.out.print(i + " ");
        
        System.out.println("\nNumeros antecessores: ");
        for (int i : numerosAleatorios) System.out.print((i-1) + " ");
        
        System.out.println("\nNumeros sucessores: ");
        for (int i : numerosAleatorios) System.out.print((i+1) + " ");
    }
}
// Crie um programa que leia dois números inteiros e mostre a soma,
// subtração, multiplicação e divisão entre eles.

package exerciciosDeLogica.variaveisEoperadores;

import java.util.Scanner;

public class Main {

    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        
        System.out.printf("Digite o primeiro numero: ");
        int n1 = teclado.nextInt();
        System.out.printf("Digite o outro numero: ");
        int n2 = teclado.nextInt();

        System.out.println("A soma dos dois numeros informados é igual a: "+ (n1 + n2));
        System.out.println("A subtração dos dois numeros informados é igual a: "+ (n1 - n2));
        System.out.println("A multiplicação dos dois numeros informados é igual a: "+ (n1 * n2));
        System.out.println("A divisão dos dois numeros informados é igual a: "+ (n1 / n2));

        teclado.close();

    }

}
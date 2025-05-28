// Leia a idade de uma pessoa e diga se ela é menor de idade, maior de idade ou idosa (>= 60 anos).

package exerciciosDeLogica.variaveisEoperadores;

import java.util.Scanner;

public class Main3 {
   
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade < 18) {

            System.out.println("Menor de idade !");

        }

        else if (idade > 18 && idade < 60){

            System.out.println("Maior de idade !");

        }

        else if (idade >= 60){

            System.out.println("Idoso(a) !");

        }

        teclado.close();

    }
    
}

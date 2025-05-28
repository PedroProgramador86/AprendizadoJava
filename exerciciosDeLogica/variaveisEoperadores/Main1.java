package exerciciosDeLogica.variaveisEoperadores;

import java.util.Scanner;

public class Main1 {

    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: ");
        float medidaMetros = teclado.nextFloat();

        System.out.println("Medida em Cm: "+ medidaMetros * 100);
        System.out.println("Medida em Mm: "+ medidaMetros * 1000);

        teclado.close();

    }
    
}

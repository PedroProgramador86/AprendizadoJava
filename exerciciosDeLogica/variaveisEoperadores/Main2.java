package exerciciosDeLogica.variaveisEoperadores;

import java.util.Scanner;

public class Main2 {
    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite a base do triangulo: ");
        float base = teclado.nextFloat();
        System.out.printf("Digite a Altura do triangulo: ");
        float altura = teclado.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("A área do triangulo é igual a : "+ area);

        teclado.close();

    }
    
}

package atividadesPOOsenac.trabalhoDeProgramacao2AP2me;

import java.util.Scanner;

public class Main {

    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        System.out.println("M e n u");
        System.out.println("\n\n");

        while (loop) {

            System.out.println("[1] - Adicionar contato");
            System.out.println("[2] - Remover contato");
            System.out.println("[3] - Listar contatos");
            System.out.println("[4] - Buscar contato");
            System.out.println("[0] - Sair");
            System.out.printf("User: ");
            int op_user = teclado.nextInt();
            
            switch (op_user) {
                case 1:

                    
                    
                break;
            
                default:

                    System.out.println("Opção Invalida !");

                break;
            }

        }


        teclado.close;
    }
    
}

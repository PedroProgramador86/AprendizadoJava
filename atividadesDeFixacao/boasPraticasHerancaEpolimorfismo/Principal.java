package atividadesDeFixacao.boasPraticasHerancaEpolimorfismo;

import java.util.Scanner;

public class Principal {
    
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a o tipo de contato que você deseja adicionar: ");
        System.out.println("[ 1 ] - Pessoal");
        System.out.println("[ 2 ] - Profissional");
        System.out.printf("User: ");

        int op_user = teclado.nextInt();
        teclado.nextLine();

        // Variaveis de preenchimento de dados:
        String nome;
        int numero;
        String email;

        String endereco;
        String dataDeAniversario;

        String empresa;
        String cargo;

        switch (op_user) {
            
            case 1:
                
                System.out.printf("Digite o nome: ");
                nome = teclado.nextLine();
                System.out.printf("Digite o Telefone: ");
                numero = teclado.nextInt();
                teclado.nextLine();
                System.out.printf("Digite o Email: ");
                email = teclado.nextLine();
                System.out.printf("Digite o Endereço: ");
                endereco = teclado.nextLine();
                System.out.printf("Digite a Data de Aniversario: ");
                dataDeAniversario = teclado.nextLine();

                Contato contatoPe = new ContatoPessoal(nome, numero, email, endereco, dataDeAniversario);
                System.out.print("\n\n");
                System.out.printf("INFORMAÇÕES:");
                contatoPe.exibirInfo();

            break;
        
            case 2:

                System.out.printf("Digite o nome: ");
                nome = teclado.nextLine();
                System.out.printf("Digite o Telefone: ");
                numero = teclado.nextInt();
                teclado.nextLine();
                System.out.printf("Digite o Email: ");
                email = teclado.nextLine();
                System.out.printf("Digite a Empresa: ");
                empresa = teclado.nextLine();
                System.out.printf("Digite o Cargo: ");
                cargo = teclado.nextLine();

                Contato contatoPr = new ContatoProfissional(nome, numero, email, empresa, cargo);
                System.out.print("\n\n");
                System.out.printf("INFORMAÇÕES:");
                contatoPr.exibirInfo();

            break;

            default:
            
            System.out.println("Opção Invalida !");

            break;
        }

        teclado.close();

    }

}

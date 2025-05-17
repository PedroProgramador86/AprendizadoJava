package atividadesPOOsenac.trabalhoDeProgramacao2AP2;

import java.util.Scanner;

public class Main {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();


        // Variaveis:
        String nome;
        String telefone;
        String email;
        
        String endereco;
        String dataDeAniversario;

        String empresa;
        String cargo;

        System.out.println("---------- G E R E N C I A M E N T O ----------");
        System.out.println("-------------------- D E ----------------------");
        System.out.println("-------------- C O N T A T O S ----------------");

        boolean loop = true;

        while (loop) {

            System.out.println("Selecione a opção desejada:");
            System.out.println("[ 1 ] - Adicionar Contato");
            System.out.println("[ 2 ] - Remover Contato");            
            System.out.println("[ 3 ] - Buscar Contato");
            System.out.println("[ 4 ] - Listar Contatos");
            System.out.println("[ 5 ] - Sair");
            System.out.printf("User: ");
            int op_user = teclado.nextInt();
            teclado.nextLine(); // comer bufer

            switch (op_user) {
                case 1:

                    System.out.println("Qual o tipo do contato ?");
                    System.out.println("[1] - Pessoal");
                    System.out.println("[2] - Profissional");
                    System.out.println("User: ");
                    int op_contato = teclado.nextInt();
                    teclado.nextLine(); // Comer o buffer

                        System.out.printf("Nome: ");
                        nome = teclado.nextLine();
                        System.out.printf("Telefone: ");
                        telefone = teclado.nextLine();
                        System.out.printf("E-mail: ");
                        email = teclado.nextLine();
                    
                    if (op_contato == 1){
                        
                        System.out.printf("Data de aniversario: ");
                        dataDeAniversario = teclado.nextLine();
                        System.out.printf("Endereço: ");
                        endereco = teclado.nextLine();

                        ContatoPessoal contatoPessoal = new ContatoPessoal(nome, telefone, email, dataDeAniversario, endereco);
                        agenda.adicionarContato(contatoPessoal);

                    }
                    else if (op_contato == 2) {

                        System.out.printf("Empresa: ");
                        empresa = teclado.nextLine();
                        System.out.printf("Cargo: ");
                        cargo = teclado.nextLine();

                        ContatoProfissional contatoProfissional = new ContatoProfissional(nome, telefone, email, empresa, cargo);
                        agenda.adicionarContato(contatoProfissional);

                    }
                    
                break;

                case 2:

                    System.out.printf("Digite o nome do contato que deseja remover: ");
                    String nomeDoContatoRemover = teclado.nextLine();

                    agenda.removerContato(nomeDoContatoRemover);
                    
                break;

                case 3:

                    System.out.printf("Digite o nome do contato que deseja procurar: ");
                    String nomeDoContatoProcura = teclado.nextLine();

                    agenda.procurarContato(nomeDoContatoProcura);
                    
                break;

                case 4:

                    agenda.listarContatos();
                    
                break;

                case 5:

                    loop = false;
                    
                break;
            
                default:

                    System.out.println("Opção Invalida !");

                break;
            }

        }

        teclado.close();

    }
    
}

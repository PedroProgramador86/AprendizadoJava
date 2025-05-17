// Respons ́avel por gerenciar os contatos. Cont ́em m ́etodos para adicionar, remover, buscar e
// listar contatos, utilizando um ArrayList para armazenar os objetos de contato.

package atividadesPOOsenac.trabalhoDeProgramacao2AP2;

public class Agenda {

    Contato[] contatos = new Contato[20];
    int quantidade = 0;

    public void adicionarContato (Contato contato) { // Função para adicionar Contato

        if (quantidade < 20) {
            contatos[quantidade] = contato;
            quantidade++;
        }
        
        else {

            System.out.println("Agenda cheia ! ");
        
        }

    }

    public void removerContato(String nome) {
    
        boolean removido = false;

        for (int i = 0; i < quantidade; i++) {
            if (contatos[i].nome.equalsIgnoreCase(nome)) {
                // Move todos os contatos seguintes uma posição para trás
                for (int j = i; j < quantidade - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }

                contatos[quantidade - 1] = null;
                quantidade--;
                removido = true;
                System.out.println("Contato removido!");
                break; // Sai após remover
            }
        }

        if (!removido) {
            System.out.println("Contato não encontrado!");
            }
        }


    public void procurarContato (String nome) {
        
        boolean encontrado = false;

    for (int i = 0; i < quantidade; i++) {
        if (contatos[i].nome.equalsIgnoreCase(nome)) {
            contatos[i].imprimirInfo();
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("Contato não encontrado.");
        }

    }

    public void listarContatos() {

        if (quantidade == 0) {

            System.out.println("Agenda vazia.");

        }
        
        else {

            for (int i = 0; i < quantidade; i++) {

                contatos[i].imprimirInfo();
                System.out.println("--------------------------");

            }

        }
    }
    
}

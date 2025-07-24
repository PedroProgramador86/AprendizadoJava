// Respons ́avel por gerenciar os contatos. Cont ́em m ́etodos para adicionar, remover, buscar e
// listar contatos, utilizando um ArrayList para armazenar os objetos de contato.

package atividadesPOOsenac.trabalhoDeProgramacao2AP2;

public class Agenda {

    //Criando objeto "contatos" da classe "contato" sendo um vetor com 20 de armazenamento
    Contato[] contatos = new Contato[20]; 
    int quantidade = 0; // Informando a quantidade de dos contatos

    // Função para adicionar Contato com um informativo se a agenda ficar cheia
    public void adicionarContato (Contato contato) {

        if (quantidade < 20) { // Verifica se a quantidade de elementos no vetor de 20 supera o armazenamento
                               // esperado
            contatos[quantidade] = contato;
            quantidade++;
        }
        
        else {

            System.out.println("Agenda cheia ! ");
        
        }

    }

    // Função de remover contatos
    public void removerContato(String nome) { // Essa função recebe o nome do contato que desejas remover
    
        boolean removido = false; // inicializa a variavel booleana como "false" 
                                  // se caso na hora do remoção ela continuar como false ele vai dizer
                                  // que o contato não foi encontrado

        for (int i = 0; i < quantidade; i++) { 

            if (contatos[i].nome.equalsIgnoreCase(nome)) { // procura o contato correspondente ao nome

                // Move todos os contatos seguintes (após o contato que desejas remover) uma posição para trás
                for (int j = i; j < quantidade - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }

                contatos[quantidade - 1] = null; // Literalmente anula o contato do vetor correspondente
                quantidade--; // Diminui uma quantidade do vetor
                removido = true; // Especifica que o contato foi removido (para ele não passar pelo
                                 // "if" que especifica que o contato não foi removido)
                System.out.println("Contato removido!"); // Mensagem relatando ao usuario que o contato foi
                                                           // removido com sucesso
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

package atividadesPOOsenac.trabalhoDeProgramacao2AP2me;

public class Agenda {

    Contato [] contatos = new Contato[20]; // Armazenamento de contatos sendo 20

    // Variaveis de instancia:
    int posicaoDisponivel;

    //Construtor:
    public Agenda (int posicaoDisponivel){ // ******** TEM QUE IR PARA A MAIN

        this.posicaoDisponivel = posicaoDisponivel;

    }

    public void adicionarContato (Contato contato) {

        System.out.println("Posições disponiveis/indisponiveis: ");

        for(int i = 0; i < 20; i++) {

            if(contatos[i] == null) {
                
                System.out.println("Espaço "+ i+1 + " vazio");

            }

            else{

                System.out.println("Espaço "+ i+1 + " ocupado");

            }

        }

        contatos[posicaoDisponivel] = contato; // inicializa a adição do contato na posição correspondente

    }

    public void removerContato (String nome) {

        boolean contatoRemovido = false;

        for( int i=0 ; i<20 ; i++ ){
    
            if(contatos[i].nome.equalsIgnoreCase(nome)){

                contatos[i] = null;
                contatoRemovido = true;
                System.out.println("Contato Removido com sucesso");
                

            }

        }

        if (!contatoRemovido) {
            
            System.out.println("Não foi possivel remover o contato");

        }
    }

    public void listarContatos () {

        for( int i = 0 ; i<20 ; i++ ){

            contatos[i].imprimirInfo();

        }

    }

    public void buscarContatos (String nome) {

        boolean contatoEncontrado = false;

        for(int i=0 ; i<20 ; i++){

            if(contatos[i].nome.equalsIgnoreCase(nome)){

                contatoEncontrado = true;
                System.out.println("CONTATO ENCONTRADO !");
                contatos[i].imprimirInfo();

            }
            

        }

        if (!contatoEncontrado) {
            
            System.out.println("Contato não encontrado");

        }

    }
    
}

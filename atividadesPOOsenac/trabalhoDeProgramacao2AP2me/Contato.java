package atividadesPOOsenac.trabalhoDeProgramacao2AP2me;

// Classe principal: Classe contato
public class Contato {

    // Variaveis de instancia:

    String nome;
    String telefone;
    String email;

    public Contato (String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }
    
    public void imprimirInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Telefone: "+ telefone);
        System.out.println("E-mail: "+ email);
    }

}

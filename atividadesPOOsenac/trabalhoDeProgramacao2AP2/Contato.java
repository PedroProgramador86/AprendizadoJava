// Classe Base Contato
// Esta classe servir ́a como classe base para outros tipos de contatos. Incluir ́a atributos b ́asicos
// como nome, telefone e email.

package atividadesPOOsenac.trabalhoDeProgramacao2AP2;

public class Contato {

    // Variaveis de Instancia
    String nome;    
    String telefone;
    String email;

    // Construtor
    public Contato (String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    public void imprimirInfo () {

        System.out.println("Nome: "+ nome);
        System.out.println("Telefone: "+ telefone);
        System.out.println("E-mail: "+ email);

    }
    
}

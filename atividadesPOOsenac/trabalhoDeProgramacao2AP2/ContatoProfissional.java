// ContatoProfissional: Deriva de Contato e inclui atributos adicionais como empresa
// e cargo.

package atividadesPOOsenac.trabalhoDeProgramacao2AP2;

public class ContatoProfissional extends Contato {

    String empresa;
    String cargo;

    public ContatoProfissional (String nome, String telefone, String email, String empresa, String cargo) {

        super(nome, telefone, email);
        this.empresa = empresa;
        this.cargo = cargo;

    }

    public void imprimirInfo () {

        super.imprimirInfo();
        System.out.println("Empresa: "+ empresa);
        System.out.println("Cargo: "+ cargo);

    }
    
}

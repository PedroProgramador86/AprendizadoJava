package atividadesPOOsenac.trabalhoDeProgramacao2AP2me;

public class ContatoProfissional extends Contato {

    String empresa;
    String cargo;

    public ContatoProfissional(String nome, String telefone, String email, String empresa, String cargo) {

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

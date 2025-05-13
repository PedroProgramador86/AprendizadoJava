package atividadesDeFixacao.boasPraticasHerancaEpolimorfismo;

public class ContatoProfissional extends Contato{
    
    String empresa;
    String cargo;

    public ContatoProfissional (String nome, int numero, String email, String empresa, String cargo) {

        super(nome, numero, email);
        this.empresa = empresa;
        this.cargo = cargo;

    }

    public void exibirInfo () {

        super.exibirInfo();
        System.out.println("Empresa: "+ empresa);
        System.out.println("Cargo: "+ cargo);

    }

}

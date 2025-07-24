package atividadesPOOsenac.trabalhoDeProgramacao2AP2me;

public class ContatoPessoal extends Contato{

    String dataDeAniversario;
    String endereco;

    public ContatoPessoal(String nome, String telefone, String email, String dataDeAniversario, String endereco) {

        super(nome, telefone, email);
        this.dataDeAniversario = dataDeAniversario;
        this.endereco = endereco;

    }
    
    public void imprimirInfo () {

        super.imprimirInfo();
        System.out.println("Data de Aniversario: "+ dataDeAniversario);
        System.out.println("Endereço: "+ endereco);

    }

}

package atividadesDeFixacao.boasPraticasHerancaEpolimorfismo;

public class ContatoPessoal extends Contato {

    String endereco;
    String dataDeAniversario; // para conter "/" e os "0s" na frente

    public ContatoPessoal (String nome, int numero, String email, String endereco, String dataDeAniversario) {

        super(nome, numero, email);
        this.endereco = endereco;
        this.dataDeAniversario = dataDeAniversario;

    }

    public void exibirInfo () {

        super.exibirInfo();
        System.out.println("Endereço: "+ endereco);
        System.out.println("Data de Aniversario: "+ dataDeAniversario);

    }
    
}

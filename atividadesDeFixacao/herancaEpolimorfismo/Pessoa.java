package atividadesDeFixacao.herancaEpolimorfismo;

public class Pessoa {

    // Variaveis de Instancia:
    String nome;
    int idade;
    String documento;

    // Construtor: 
    public Pessoa (String nome, int idade, String documento) {

        this.nome = nome;
        this.idade = idade;
        this.documento = documento;

    }

    // Função:
    public void exibirInfo () {

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Documento: "+ documento);

    }
    
}

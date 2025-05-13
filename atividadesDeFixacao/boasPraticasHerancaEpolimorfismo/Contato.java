package atividadesDeFixacao.boasPraticasHerancaEpolimorfismo;

public class Contato {
    
    String nome;
    int numero;
    String email;

    public Contato (String nome, int numero, String email) {

        this.nome = nome;
        this.numero = numero;
        this.email = email;

    }

    public void exibirInfo () {

        System.out.println("Nome: "+ nome);
        System.out.println("Numero: "+ numero);
        System.out.println("E-mail: "+ email);

    }

}

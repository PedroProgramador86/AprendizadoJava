package atividadesDeFixacao.herancaEpolimorfismo;

public class Enfermeiro extends Pessoa{

    int horaTrabalho;
    String setor;
    int numeroCadastro;

    public Enfermeiro (String nome, int idade, String documento, int horaTrabalho, String setor, int numeroCadastro){

        super(nome, idade, documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;

    }

    public void exibirInfo (){

        super.exibirInfo();
        System.out.println("Hora de Trabalho: "+ horaTrabalho);
        System.out.println("Setor: "+ setor);
        System.out.println("Numero De Cadastro: "+ numeroCadastro);
        
    }
    
}

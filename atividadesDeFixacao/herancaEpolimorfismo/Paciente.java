package atividadesDeFixacao.herancaEpolimorfismo;

public class Paciente extends Pessoa{

    int matricula;
    String planoDeSaude;

    public Paciente (String nome, int idade, String documento, int matricula, String planoDeSaude) {

        super(nome, idade, documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;

    }

    public void exibirInfo () {

        super.exibirInfo(); // puxa o a função da classe Pessoa
        System.out.println("Matricula: "+ matricula);
        System.out.println("Plano de Saude: "+ planoDeSaude);

    }
    
}

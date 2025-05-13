package atividadesDeFixacao.herancaEpolimorfismo;

public class Main {

    public static void main (String[]args){

        // Criando objeto Pessoa de Pessoa (classe que serve de padrão para todas as outras)
        Pessoa pessoa = new Pessoa("Pedro Enzo Lima", 19, "1234asd1234");
        pessoa.exibirInfo(); // Exibindo Informações

        // Criando objeto paciente utilizando apenas a herança
        Paciente paciente = new Paciente("Pedro Enzo Luna", 19, "O12D23F49P98", 99882233, "Hapivida");
        paciente.exibirInfo(); // Exibindo Informações

        // Criando objeto enfermeiro utilizando apenas a herança
        Enfermeiro enfermeiro = new Enfermeiro("Pedro", 19, "1345454", 8, "Cirurgia", 023432);
        enfermeiro.exibirInfo(); // Exibindo Informações

        // Utilizando Polimorfismo

        // Utilizando polimorfismo para criar uma pessoa do tipo enfermeiro
        Pessoa enfermeiroPolimorfico = new Enfermeiro("Jose", 23, "3435454", 9, "Ginecologista", 123445);
        enfermeiroPolimorfico.exibirInfo();

        Pessoa pacientePolimorfico = new Paciente("Girabaldo", 45, "9802784362", 47829, "Unimed");
        pacientePolimorfico.exibirInfo();

    }

}
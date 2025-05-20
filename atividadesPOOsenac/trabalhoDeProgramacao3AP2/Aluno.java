// Informando o direcionamento do pacote
package atividadesPOOsenac.trabalhoDeProgramacao3AP2;

public class Aluno { // Classe Aluno

    // Variaveis de instancia privadas
    private int id;                 
    private String matricula;
    private String nome;
    private String senha;

    public Aluno (int id, String matricula, String nome, String senha) {

        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.senha= senha;

    }
    
    public int getId () { // Getter para Id
    // O getter deve corresponder ao tipo do dado que sera coletado

        return id; //retornar o nome da variavel de instancia

    }

    public void setId (int id) { // Setter para Id
    // O setter deve corresponder ao tipo "void", 
    // porém recebendo um parametro do tipo e variavel que será atribuido
        this.id = id;

    }

    public String getMatricula () {

        return matricula;

    }

    public void setMatricula (String matricula) {

        this.matricula = matricula;

    }

    public String getNome () {

        return nome;

    }

    public void setNome (String nome) {

        this.nome = nome;

    }

    public String getSenha () {

        return senha;

    }

    public void setSenha (String senha) {

        this.senha = senha;

    } 
    
}

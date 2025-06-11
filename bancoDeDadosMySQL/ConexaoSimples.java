/*
 * Observações importantes para seguir entecipadamente:
 * 
 * 1. No diretorio ".vscode" é necessario ter "launch.json" e "settings.json"
 * 
 * 1.1 Em "launch.json" é necessario ter os seguintes dados cruciais abaixo de "configurations" para o
 * VsCode encontrar a chave .jar :
 * 
 * {
            "type": "java",
            "name": "Executar ConexaoSimples",
            "request": "launch",
            "mainClass": "bancoDeDadosMySQL.ConexaoSimples",
            "projectName": "AprendizadoJava_9ec2744d",
            "vmArgs": "-cp ${workspaceFolder}/lib/mysql-connector-j-8.4.0.jar"
        },
 * 
 * 1.2 Em "settings.json" é necessario especificar a referencia da biblioteca (chave) do MySQL:
 * 
 *      {
            "java.project.referencedLibraries": [
                "lib/mysql-connector-j-8.4.0.jar"
            ]
        }
 * 
 * OBS: essa "lib/mysql-connector-j-8.4.0.jar" aponta para uma pasta dentro do projeto chamada de "lib"
 * contendo a especificação do chave .jar
 * 
 * Se não tiver a pasta lib com a chava dentro, ele não vai encontrar quando for rodar o seguinte codigo:
 * 
 * export CLASSPATH=mysql-connector-j-8.4.0.jar:.
 * 
 * 2. Por fim é só rodar o codigo no terminal e seguir os passos a passos a diante:
 * 
 * export CLASSPATH=mysql-connector-j-8.4.0.jar:.
 * 
 * 
 * 3. Proximos passos:
 */

package bancoDeDadosMySQL;// Especificando o caminho para a IDE

// 1. Importando pacotes necessarios:
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSimples {

    public static void main (String[]args) { 

        // 2. Na função main, crie variaveis que vão receber as informações
        // do banco de dados mySQL p.ex:
        // url - para saber qual é o banco de dados
        // user - para saber qual é o usuario que deve acessar
        // senha - para o java conseguir logar na conta

        String url = "jdbc:mysql://acilab.com.br:3309/pedro_luna"; // URL do banco de dados
        String usr = "root"; // Nome do Usuario
        String senha = "admin"; // Senha do usuario

        try {

            // Estabelece a Conexão:
            Connection conexao = DriverManager.getConnection(url, usr, senha);
            System.out.println("Conexão estabelecida com sucesso !");
            conexao.close(); // Fechando a conexão
        
        } catch (SQLException e) {

            System.err.println("Erro na conexão: "+ e.getMessage());

        }

        // Isso só serve para testar se a conexão pode ser ativada

    }
    
}

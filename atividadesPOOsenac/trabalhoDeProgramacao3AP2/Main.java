
import java.sql.Connection;
import java.sql.SQLException;


import java.nio.file.WatchEvent;
import java.util.Scanner; // Importando scanner

public class Main {
    public static void main (String[]args) throws SQLException {

        DBconection conectar = new DBconection();
        Connection conexao = conectar.get();

        //Criando objeto de scanner
        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        System.out.println("---------- S I S T E M A   A C A D E M I C O ----------");
        

        while (loop) {
            
            System.out.println("| M e n u :");
            System.out.println("| Selecione a opção desejada:");
            System.out.println("| [1] - Cadastrar Aluno");
            System.out.println("| [2] - Fazer Login");
            System.out.println("| [3] - Sair");
            System.out.printf("\n");
            System.out.printf("User: ");
            int op_user = teclado.nextInt();

            switch (op_user) {

                // case 1:


                    
                // break;

                // case 2:


                    
                // break;

                case 3:

                    loop = false;

                break;
            
                default:

                    System.out.printf("\n");
                    System.out.println("Opção Invalida ! Digite novamente:");
                    System.out.printf("\n\n");

                break;
            }

        }

        teclado.close();

    }
    
}

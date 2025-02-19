
package bibliotec;
import java.sql.*;
/**
 *
 * @author aluno
 */
public class Conexao {
  
    static Connection connection = null;
<<<<<<< HEAD
    String url = "jdbc:mysql://localhost:3306/B5";
=======
    String url = "jdbc:mysql://localhost:3306/b2";
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    String user = "root";
    String password = "password";

    public Conexao() {
<<<<<<< HEAD
        if (connection == null ){
=======
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }
    }
<<<<<<< HEAD
    }
=======
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

    public static Connection getConexao() {
        return connection;
    }
}


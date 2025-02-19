
package bibliotec;
import java.sql.*;
/**
 *
 * @author aluno
 */
public class Conexao {
  
    static Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/B5";
    String user = "root";
    String password = "password";

    public Conexao() {
        if (connection == null ){
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }
    }
    }

    public static Connection getConexao() {
        return connection;
    }
}


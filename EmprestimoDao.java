package bibliotec;

import java.sql.*;
import java.time.LocalDate;

public class EmprestimoDao {

    Conexao Conexao = new Conexao();

    public void inserirEmprestimo(Emprestimo emprestimo) {

        try {
            String sql = "INSERT INTO Emprestimo (consumidor, ID_LIVRO_FK, data_atual, data_final, valor, BIBLIO_RESPONSAVEL, VALOR_MULTA	, devolvido) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, emprestimo.getConsumidor());
            ps.setInt(2, emprestimo.getCod_livro());
            ps.setObject(3, emprestimo.getData_atual());
            ps.setObject(4, emprestimo.getData_final());
            ps.setFloat(5, emprestimo.getValor());
            ps.setString(6, emprestimo.getBibliotecario_responsavel());
            ps.setFloat(7, emprestimo.getValor_multa());
            ps.setBoolean(8, emprestimo.isDevolvido());

            ps.executeUpdate();

            System.out.println("\nEmpréstimo inserido com sucesso!");
            LivroDao.dism1(emprestimo.getCod_livro(), Conexao);

            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);

        }
    }

    public void calcularMulta(int idEmprestimo) {
        int multadia= 2;

        try {
            String sql = "select DIAS_DIFERENCA from emprestimo WHERE ID_EMPRESTIMO = ?";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, idEmprestimo); 
            ResultSet rst = ps.executeQuery();

            if (rst.next()) {
                int diasDiferenca = rst.getInt("DIAS_DIFERENCA");
                if (diasDiferenca < 0) {
                    double multa = diasDiferenca * multadia;
                    System.out.println("A multa é: R$ " + (-1*multa));
                } else {
                    System.out.println("Nenhuma multa aplicável.");
                }
            } else {
                System.out.println("Empréstimo não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
    }

    public void setdevotrue( int idemprestimo) {

        try {
            String sql = "UPDATE emprestimo SET devolvido = true WHERE ID_emprestimo = ?";
            PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
            sttmt.setInt(1, idemprestimo);
            int rowsAffected = sttmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("devolvido com sucesso.");
            } else {
                System.out.println("Nenhum emprestimo encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultar() {
        try {
            String sql = "select * from EMPRESTIMO;";
            PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                int codTransacao = rst.getInt("ID_EMPRESTIMO");
                String consumidor = rst.getString("consumidor");
                int codLivro = rst.getInt("ID_LIVRO_FK");
                LocalDate dataAtual = rst.getObject("data_atual", LocalDate.class);
                LocalDate dataFinal = rst.getObject("data_final", LocalDate.class);
                double valor = rst.getDouble("valor");
                String bibliotecarioResponsavel = rst.getString("biblio_responsavel");
                int dias_dif = rst.getInt("DIAS_DIFERENCA");
                boolean devolvido = rst.getBoolean("devolvido");

                System.out.println("Código da Transação: " + codTransacao);
                System.out.println("Consumidor: " + consumidor);
                System.out.println("Código do Livro: " + codLivro);
                System.out.println("Data Atual: " + dataAtual);
                System.out.println("Data Final: " + dataFinal);
                System.out.println("Valor: " + valor);
                System.out.println("Bibliotecário Responsável: " + bibliotecarioResponsavel);
                System.out.println("Devolvido: " + (devolvido ? "Sim" : "Não"));
                System.out.println("-----------------------------");

            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: " + ex);
        }

    }

}

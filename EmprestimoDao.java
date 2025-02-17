package bibliotec;

import java.sql.*;

public class EmprestimoDao {

    Conexao Conexao  = new Conexao();

    public void inserirEmprestimo(Emprestimo emprestimo) {

        try {
       String sql = "INSERT INTO Emprestimo (consumidor, cod_livro, data_atual, data_final, valor, bibliotecario_responsavel, valor_multa, devolvido) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Prepara a declaração SQL
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            
            // Define os valores dos parâmetros
            ps.setString(1, emprestimo.getConsumidor());
            ps.setInt(2, emprestimo.getCod_livro());
            ps.setString(3, emprestimo.getData_atual());
            ps.setString(4, emprestimo.getData_atual());
            ps.setFloat(5, emprestimo.getValor());
            ps.setString(6, emprestimo.getBibliotecario_responsavel());
            ps.setFloat(7, emprestimo.getValor_multa());
            ps.setBoolean(8, emprestimo.isDevolvido());
            
            // Executa a inserção
            ps.executeUpdate();
            
            // Mensagem de sucesso
            System.out.println("\nEmpréstimo inserido com sucesso!");
            
            // Fecha o PreparedStatement
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);

        }
    }

    public void consultar() {
        try {
            String sql = "select * from Usuario;";
            PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                int codTransacao = rst.getInt("cod_transacao");
                String consumidor = rst.getString("consumidor");
                int codLivro = rst.getInt("cod_livro");
                java.util.Date dataAtual = rst.getDate("data_atual");
                java.util.Date dataFinal = rst.getDate("data_final");
                double valor = rst.getDouble("valor");
                String bibliotecarioResponsavel = rst.getString("bibliotecario_responsavel");
                double valorMulta = rst.getDouble("valor_multa");
                boolean devolvido = rst.getBoolean("devolvido");

                // Exibe os dados no console
                System.out.println("Código da Transação: " + codTransacao);
                System.out.println("Consumidor: " + consumidor);
                System.out.println("Código do Livro: " + codLivro);
                System.out.println("Data Atual: " + dataAtual);
                System.out.println("Data Final: " + dataFinal);
                System.out.println("Valor: " + valor);
                System.out.println("Bibliotecário Responsável: " + bibliotecarioResponsavel);
                System.out.println("Valor da Multa: " + valorMulta);
                System.out.println("Devolvido: " + (devolvido ? "Sim" : "Não"));
                System.out.println("-----------------------------");

            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: " + ex);
        }

    }

}

package bibliotec;

import java.sql.*;

public class LivroDao {

    Conexao Conexao  = new Conexao();

    public void inserirlivro(Livro ld) {

        try {
<<<<<<< HEAD
            String sql = "insert into Livro ( titulo, autor, genero,data_lancamento, faixa_Etaria,paginas,edicao,disponibilidade) values (  ?, ?, ?, ?, ?, ?, ?, ?)";
=======
            String sql = "insert into Livro ( titulo, autor, genero,datalancamento, faixaEtaria,paginas,edicao,disp) values (  ?, ?, ?, ?, ?, ?, ?, ?)";
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, ld.getTitulo());
            ps.setString(2, ld.getAutor());
            ps.setString(3, ld.getGenero());
<<<<<<< HEAD
            ps.setObject(4, ld.getDatalancamento()); 
=======
            ps.setString(4, ld.getDatalancamento());
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
            ps.setString(5, ld.getFaixaEtaria());
            ps.setInt(6, ld.getPaginas());
            ps.setInt(7, ld.getEdição());
            ps.setInt(8, ld.getDisp());

            ps.executeUpdate();

<<<<<<< HEAD
            System.out.println("\n livro inserido com sucesso");
        } catch (SQLException e) {
=======
            System.out.println("\n Pessoa inserida com sucesso");
        } catch (Exception e) {
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
            System.out.println("Erro: " + e);

        }
    }

<<<<<<< HEAD
public void consultarLivro() {
    try {
        String sql = "select * from Livro;";
        PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
        ResultSet rst = sttmt.executeQuery();
        while (rst.next()) {
            int idLivro = rst.getInt("id_livro"); // Obtém o ID do livro
            String titulo = rst.getString("titulo"); // Obtém o título
            String autor = rst.getString("autor"); // Obtém o autor
            String genero = rst.getString("genero"); // Obtém o gênero
            String dataLancamento = rst.getString("data_lancamento"); // Obtém a data de lançamento
            String faixaEtaria = rst.getString("faixa_Etaria"); // Obtém a faixa etária
            int paginas = rst.getInt("paginas"); // Obtém o número de páginas
            int edicao = rst.getInt("edicao"); // Obtém a edição
            int disp = rst.getInt("disponibilidade"); // Obtém a disponibilidade

            System.out.println("ID: " + idLivro);
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Gênero: " + genero);
            System.out.println("Data de Lançamento: " + dataLancamento);
            System.out.println("Faixa Etária: " + faixaEtaria);
            System.out.println("Páginas: " + paginas);
            System.out.println("Edição: " + edicao);
            System.out.println("Disponibilidade: " + disp);
            System.out.println("-----------------------------");
        }
    } catch (SQLException ex) {
        System.out.println("Erro na consulta de pessoa: " + ex);
    }
}

public static void dism1(int idlivro, Conexao Conexao) {
    String sql = "UPDATE LIVRO SET DISPONIBILIDADE = DISPONIBILIDADE - 1 WHERE ID_LIVRO = ?";
    
    try (PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql)) {
        sttmt.setInt(1, idlivro); 
        int rowsAffected = sttmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Disponibilidade do livro reduzida com sucesso.");
        } else {
            System.out.println("Nenhum livro encontrado com o ID fornecido.");
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    }
}
public static void disma1(int idlivro, Conexao Conexao) {
    String sql = "UPDATE LIVRO SET DISPONIBILIDADE = DISPONIBILIDADE + 1 WHERE ID_LIVRO = ?";
    
    try (PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql)) {
        sttmt.setInt(1, idlivro); 
        int rowsAffected = sttmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Disponibilidade do livro reduzida com sucesso.");
        } else {
            System.out.println("Nenhum livro encontrado com o ID fornecido.");
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    }
}
=======
    public void consultarLivro() {
        try {
            String sql = "select * from Livro;";
            PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                int idLivro = rst.getInt("id_livro"); // Obtém o ID do livro
                String titulo = rst.getString("titulo"); // Obtém o título
                String autor = rst.getString("autor"); // Obtém o autor
                String genero = rst.getString("genero"); // Obtém o gênero
                String dataLancamento = rst.getString("datalancamento"); // Obtém a data de lançamento
                String faixaEtaria = rst.getString("faixaEtaria"); // Obtém a faixa etária
                int paginas = rst.getInt("paginas"); // Obtém o número de páginas
                int edicao = rst.getInt("edicao"); // Obtém a edição
                int disp = rst.getInt("disp"); // Obtém a disponibilidade

                System.out.println("ID: " + idLivro);
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Gênero: " + genero);
                System.out.println("Data de Lançamento: " + dataLancamento);
                System.out.println("Faixa Etária: " + faixaEtaria);
                System.out.println("Páginas: " + paginas);
                System.out.println("Edição: " + edicao);
                System.out.println("Disponibilidade: " + disp);
                System.out.println("-----------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: " + ex);
        }
        
    }
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

public void Dispm1(int idlivro) {
    try {

        String sql = "SELECT id_livro FROM Livro;";
        
        PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
        
        ResultSet rst = sttmt.executeQuery();
        
       
        while (rst.next()) {
            int idLivrosql = rst.getInt("id_livro"); 
            if (idLivrosql == idlivro) {
                System.out.println("ID do livro encontrado: " + idLivrosql);
                String sql2 = "SELECT disp FROM Livro where " + "idLivrosql" +"==" + idlivro;
                break;
            }
        }
        
        rst.close();
        sttmt.close();
    } catch (SQLException ex) {
        System.out.println("Erro ao consultar livros: " + ex.getMessage());
    }
}
}
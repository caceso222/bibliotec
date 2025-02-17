package bibliotec;

import java.sql.*;

public class LivroDao {

    Conexao Conexao  = new Conexao();

    public void inserirlivro(Livro ld) {

        try {
            String sql = "insert into Livro ( titulo, autor, genero,datalancamento, faixaEtaria,paginas,edicao,disp) values (  ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, ld.getTitulo());
            ps.setString(2, ld.getAutor());
            ps.setString(3, ld.getGenero());
            ps.setString(4, ld.getDatalancamento());
            ps.setString(5, ld.getFaixaEtaria());
            ps.setInt(6, ld.getPaginas());
            ps.setInt(7, ld.getEdição());
            ps.setInt(8, ld.getDisp());

            ps.executeUpdate();

            System.out.println("\n Pessoa inserida com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e);

        }
    }

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
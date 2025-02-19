<<<<<<< HEAD
package bibliotec;

import java.sql.*;
import java.util.Scanner;

public class UsuarioDao {

    Conexao Conexao = new Conexao();
    Scanner scanner = new Scanner(System.in);

    public void inserirUsuario(Usuario usuario) {

        try {
            String sql = "INSERT INTO Usuario (nome, cpf, autoridade, pendencias, senha) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

=======

package bibliotec;

import java.sql.*;

public class UsuarioDao {
    Conexao Conexao  = new Conexao();
    
    public void inserirUsuario(Usuario usuario){
        
        try{
          String sql = "INSERT INTO Usuario (nome, cpf, autoridade, pendencias, senha) VALUES (?, ?, ?, ?, ?)";
            
           
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            
            
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setInt(3, usuario.getAutoridade());
            ps.setInt(4, usuario.getPendencias());
<<<<<<< HEAD
            ps.setString(5, usuario.getSenha());

            ps.executeUpdate();

            System.out.println("\nUsuário inserido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro: " + e);

        }
    }

    public void consultarUsuario() {
        try {
            String sql = "select * from Usuario;";
            PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                int codUsuario = rst.getInt("cod_usuario");
                String nome = rst.getString("nome");
                String cpf = rst.getString("cpf");
                int autoridade = rst.getInt("autoridade");
                int pendencias = rst.getInt("pendencias");
                String senha = rst.getString("senha");

=======
            ps.setInt(5, usuario.getSenha());
            
            
            ps.executeUpdate();
            
            
            System.out.println("\nUsuário inserido com sucesso!");
            
        }
        catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
  
    public void consultarUsuario(){
        try {
            String sql="select * from Usuario;";
            PreparedStatement sttmt=Conexao.getConexao().prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                                int codUsuario = rst.getInt("cod_usuario"); 
                String nome = rst.getString("nome"); 
                String cpf = rst.getString("cpf");
                int autoridade = rst.getInt("autoridade");
                int pendencias = rst.getInt("pendencias");
                String senha = rst.getString("senha"); 

                
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
                System.out.println("Código do Usuário: " + codUsuario);
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Autoridade: " + autoridade);
                System.out.println("Pendências: " + pendencias);
<<<<<<< HEAD
                System.out.println("Senha: " + senha);
=======
                System.out.println("Senha: " + senha); 
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
                System.out.println("-----------------------------");

            }
        } catch (SQLException ex) {
<<<<<<< HEAD
            System.out.println("Erro na consulta de pessoa: " + ex);
        }
    
    }

    public Usuario loginUsuario(Usuario u) {
        System.out.println("Qual o seu CPF (sem espaços):");
    String cpf = scanner.nextLine();

    System.out.println("Qual é a sua senha:");
    String senha = scanner.nextLine();

    try {
        // Consulta o usuário no banco de dados
        String sql = "SELECT * FROM USUARIO WHERE CPF = ? AND SENHA = ?";
        PreparedStatement sttmt = Conexao.getConexao().prepareStatement(sql);
        sttmt.setString(1, cpf);
        sttmt.setString(2, senha);
        ResultSet rst = sttmt.executeQuery();

        if (rst.next()) {
            // Se o usuário for encontrado, cria um objeto Usuario com os dados do banco
            Usuario usuario = new Usuario();
            usuario.setCod_usuario(rst.getInt("ID_USUARIO"));
            usuario.setNome(rst.getString("NOME"));
            usuario.setCpf(rst.getString("CPF"));
            usuario.setAutoridade(rst.getInt("AUTORIDADE"));
            usuario.setPendencias(rst.getInt("PENDENCIAS"));
            usuario.setSenha(rst.getString("SENHA"));

            System.out.println("Login bem-sucedido!");
            return usuario; 
        } else {
            System.out.println("CPF ou senha incorretos. Tente novamente.");
        }

        rst.close();
        sttmt.close();
    } catch (SQLException e) {
        System.out.println("Erro ao realizar login: " + e.getMessage());
    }

    return null; 
=======
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    
    }
        public void Dispm1() {
        
        
        
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
}
}

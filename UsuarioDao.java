
package bibliotec;

import java.sql.*;

public class UsuarioDao {
    Conexao Conexao  = new Conexao();
    
    public void inserirUsuario(Usuario usuario){
        
        try{
          String sql = "INSERT INTO Usuario (nome, cpf, autoridade, pendencias, senha) VALUES (?, ?, ?, ?, ?)";
            
           
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setInt(3, usuario.getAutoridade());
            ps.setInt(4, usuario.getPendencias());
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

                
                System.out.println("Código do Usuário: " + codUsuario);
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Autoridade: " + autoridade);
                System.out.println("Pendências: " + pendencias);
                System.out.println("Senha: " + senha); 
                System.out.println("-----------------------------");

            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    
    }
        public void Dispm1() {
        
        
        
}
}

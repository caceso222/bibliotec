package bibliotec;



import java.util.Scanner;

public class Usuario {
    private String nome;
    private int autoridade;
    private String cpf;
    private int cod_usuario;
    private int pendencias;
    private int senha;

    

    Usuario(String nome, int autoridade, String cpf, int cod_usuario, int pendencias, int senha) {
        this.nome = nome;
        this.autoridade = autoridade;
        this.cpf = cpf;
        this.cod_usuario = cod_usuario;
        this.pendencias = pendencias;
        this.senha = senha;
    }

    public Usuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o nível de autoridade: ");
        this.autoridade = scanner.nextInt();

        System.out.print("Digite o CPF: ");
        this.cpf = scanner.nextLine();
        this.cpf = scanner.nextLine();

        System.out.print("Digite a senha: ");
        this.senha = scanner.nextInt();

        this.pendencias = 0;

        System.out.println("Usuário criado com sucesso!");
        
        
    }

    // Método para exibir informações do usuário
    public void exibir() {
        System.out.println("Informações do Usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Código do Usuário: " + cod_usuario);
        System.out.println("Pendências: " + pendencias);
        System.out.println("Senha: ********"); // A senha não é exibida por segurança
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAutoridade() {
        return autoridade;
    }

    public void setAutoridade(int autoridade) {
        this.autoridade = autoridade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public int getPendencias() {
        return pendencias;
    }

    public void setPendencias(int pendencias) {
        this.pendencias = pendencias;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}


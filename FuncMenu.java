package bibliotec;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncMenu {

    EmprestimoDao ed = new EmprestimoDao();
    LivroDao ld = new LivroDao();
    UsuarioDao ud = new UsuarioDao();
    
    Scanner scanner = new Scanner(System.in);

    public void executarMenuCompleto(ArrayList<Usuario> listUsuarios, ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        while (opcao != 8) {
            Menu.exibirMenuCompleto();

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarUsuario();
                    break;
                case 2:
                    loginUsuario(listUsuarios);
                    break;
                case 3:
                    adicionarLivro();
                    break;
                case 4:
                    adicionarEmprestimo();
                    break;
                case 5:
                    devolverEmprestimo();
                    break;
                case 6:
                    exibirCatalogo();
                    break;
                case 7:
                    exibirHistorico();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void executarMenuBibliotecario(ArrayList<Usuario> listUsuarios, ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        Menu.exibirMenuBibliotecario();

        while (opcao != 8) {
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarUsuario();
                    break;
                case 2:
                    loginUsuario(listUsuarios);
                    break;
                case 3:
                    devolverEmprestimo();
                    break;
                case 4:
                    exibirCatalogo();
                    break;
                case 5:
                    exibirHistorico();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void executarMenuConsumidor(ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        while (opcao != 5) {
            Menu.exibirMenuConsumidor();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirCatalogo();
                    break;
                case 2:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void adicionarLivro() {
        Livro livro = new Livro();
        
        ld.inserirlivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void adicionarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        
        ed.inserirEmprestimo(emprestimo);
        System.out.println("Empréstimo registrado com sucesso!");
    }

    public Usuario loginUsuario(ArrayList<Usuario> listUsuarios) {
        String x = "-1";
        System.out.println("Qual o seu CPF (sem espaços):");
        String cpf = scanner.nextLine();
        for (Usuario u : listUsuarios) {
            if (cpf.equals(u.getCpf())) {
                if (x.equals(u.getCpf())) {
                    System.out.println("cpf invalido");
                } else {
                    System.out.println("qual é a sua senha");
                    String s = scanner.nextLine();
                    if (u.getSenha().equals(s)) {
                        System.out.println("Login bem-sucedido!");
                        return u; // Retorna o usuário logado  
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println("login-mal-sucedido. Tente novamente.");
        return null;
    }

    public void adicionarUsuario() {
        Usuario usuario = new Usuario();
        ud.inserirUsuario(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    public void devolverEmprestimo() {
        System.out.println("Digite o código da transação:");
        int codTransacao = scanner.nextInt();
        ed.setdevotrue( codTransacao);
        ed.calcularMulta(codTransacao);
    }

    public void exibirCatalogo() {

         ld.consultarLivro();
    }

    public void exibirHistorico() {

    ed.consultar();

    }

}

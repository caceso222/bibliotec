
package bibliotec;

import java.util.ArrayList;
import java.util.Scanner;


public class FuncMenu{

     Scanner scanner = new Scanner(System.in);
      public void executarMenuCompleto( ArrayList<Usuario> listUsuarios, ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        while (opcao != 8) {
            Menu.exibirMenuCompleto();

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarUsuario(listUsuarios);
                    break;
                case 2:
                    loginUsuario(listUsuarios);
                    break;
                case 3:
                    adicionarLivro(listLivros);
                    break;
                case 4:
                    adicionarEmprestimo(listaEmprestimos);
                    break;
                case 5:
                    devolverEmprestimo( listaEmprestimos);
                    break;
                case 6:
                    exibirCatalogo(listLivros);
                    break;
                case 7:
                    exibirHistorico(listaEmprestimos);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void executarMenuBibliotecario( ArrayList<Usuario> listUsuarios, ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        Menu.exibirMenuBibliotecario();

        while (opcao != 8) {
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarUsuario(listUsuarios);
                    break;
                case 2:
                    loginUsuario( listUsuarios);
                    break;
                case 3:
                    devolverEmprestimo( listaEmprestimos);
                    break;
                case 4:
                    exibirCatalogo(listLivros);
                    break;
                case 5:
                    exibirHistorico(listaEmprestimos);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void executarMenuConsumidor( ArrayList<Livro> listLivros, ArrayList<Emprestimo> listaEmprestimos) {
        int opcao = 0;
        while (opcao != 5) {
            Menu.exibirMenuConsumidor();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirCatalogo(listLivros);
                    break;
                case 2:
                    //exibirHistorico(listaEmprestimos);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    public void adicionarLivro(ArrayList<Livro> listLivros) {
        Livro livro = new Livro();
        listLivros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }
      
     public void adicionarEmprestimo(ArrayList<Emprestimo> listaEmprestimos) {
        Emprestimo emprestimo = new Emprestimo();
        listaEmprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado com sucesso!");
    }
     
   public Usuario loginUsuario( ArrayList<Usuario> listUsuarios) {
        System.out.println("Qual o seu CPF (sem espaços):");
        String cpf = scanner.nextLine();
        for (Usuario u : listUsuarios) {
            if (cpf.equals(u.getCpf())) {
                System.out.println("Login bem-sucedido!");
                return u; // Retorna o usuário logado
            }
        }
        System.out.println("CPF não encontrado. Tente novamente.");
        return null; // Retorna null se o login falhar
    }

 public void adicionarUsuario(ArrayList<Usuario> listUsuarios) {
        Usuario usuario = new Usuario();
        listUsuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    
    public void devolverEmprestimo( ArrayList<Emprestimo> listaEmprestimos) {
        System.out.println("Digite o código da transação:");
        int codTransacao = scanner.nextInt();
        for (Emprestimo e : listaEmprestimos) {
            if (codTransacao == e.getCod_transacao()) {
                e.multa(scanner);
                e.setDevolvido(true);
                System.out.println("Devolução realizada com sucesso!");
                return;
            }
        }
       }
    public void exibirCatalogo(ArrayList<Livro> listLivros) {

                if (listLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : listLivros) {
                livro.exibirResumo();
            }
        }
    }

    public void exibirHistorico(ArrayList<Emprestimo> listaEmprestimos) {
        for (Emprestimo emprestimo : listaEmprestimos) {
            emprestimo.exibir();
        }
    
}
    
    
}

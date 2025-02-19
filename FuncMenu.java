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
<<<<<<< HEAD
                    adicionarUsuario();
=======
                    adicionarUsuario(listUsuarios);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
                    break;
                case 2:
                    loginUsuario(listUsuarios);
                    break;
                case 3:
<<<<<<< HEAD
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
=======
                    adicionarLivro(listLivros);
                    break;
                case 4:
                    adicionarEmprestimo(listaEmprestimos);
                    break;
                case 5:
                    devolverEmprestimo(listaEmprestimos);
                    break;
                case 6:
                    exibirCatalogo(listLivros);
                    break;
                case 7:
                    exibirHistorico(listaEmprestimos);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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
<<<<<<< HEAD
                    adicionarUsuario();
=======
                    adicionarUsuario(listUsuarios);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
                    break;
                case 2:
                    loginUsuario(listUsuarios);
                    break;
                case 3:
<<<<<<< HEAD
                    devolverEmprestimo();
                    break;
                case 4:
                    exibirCatalogo();
                    break;
                case 5:
                    exibirHistorico();
=======
                    devolverEmprestimo(listaEmprestimos);
                    break;
                case 4:
                    exibirCatalogo(listLivros);
                    break;
                case 5:
                    exibirHistorico(listaEmprestimos);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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
<<<<<<< HEAD
                    exibirCatalogo();
                    break;
                case 2:
=======
                    exibirCatalogo(listLivros);
                    break;
                case 2:
                    //exibirHistorico(listaEmprestimos);
                    break;
                case 3:
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

<<<<<<< HEAD
    public void adicionarLivro() {
        Livro livro = new Livro();
        
=======
    public void adicionarLivro(ArrayList<Livro> listLivros) {
        Livro livro = new Livro();
        listLivros.add(livro);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        ld.inserirlivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

<<<<<<< HEAD
    public void adicionarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        
=======
    public void adicionarEmprestimo(ArrayList<Emprestimo> listaEmprestimos) {
        Emprestimo emprestimo = new Emprestimo();
        listaEmprestimos.add(emprestimo);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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
<<<<<<< HEAD
                    String s = scanner.nextLine();
                    if (u.getSenha().equals(s)) {
=======
                    int s = scanner.nextInt();
                    if (u.getSenha() ==  s) {
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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

<<<<<<< HEAD
    public void adicionarUsuario() {
        Usuario usuario = new Usuario();
=======
    public void adicionarUsuario(ArrayList<Usuario> listUsuarios) {
        Usuario usuario = new Usuario();
        listUsuarios.add(usuario);
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        ud.inserirUsuario(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

<<<<<<< HEAD
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
=======
    public void devolverEmprestimo(ArrayList<Emprestimo> listaEmprestimos) {
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
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

    }

}

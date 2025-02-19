package bibliotec;


import java.util.ArrayList;

public class Dao {

    private static ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
    private static ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private static ArrayList<Livro> listLivros = new ArrayList<>();

    public Livro getLivroId(int id_livro) {
        for (Livro livro : listLivros) {
            if (livro.getId_livro() == id_livro) {
                return livro;
            }
        }
        return null;
    }
    
    public ArrayList<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    public ArrayList<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public ArrayList<Livro> getListLivros() {
        return listLivros;
    }

    public void setListLivros(ArrayList<Livro> listLivros) {
        this.listLivros = listLivros;
    }
}


package bibliotec;

import java.util.ArrayList;

public class Dao {
        public static ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
        public static ArrayList<Usuario> listUsuarios = new ArrayList<>();
        public static ArrayList<Livro> listLivros = new ArrayList<>();

        
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


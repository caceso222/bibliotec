package bibliotec;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotec {

    public static void main(String[] args) {
        // Arrays para armazenar os objetos
        Usuario nowlog = new Usuario("", 0, "-1", 0, 0, 0);
        Usuario po = new Usuario("po", 0, "777", 0, 0, 0);

        Dao d = new Dao();
        FuncMenu FuncMenu = new FuncMenu();

        d.getListUsuarios().add(po);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (true) {
            if (FuncMenu.loginUsuario(d.getListUsuarios()) == null) {

            } else {

                if (0 == nowlog.getAutoridade()) {
                    FuncMenu.executarMenuCompleto(d.getListUsuarios(), d.getListLivros(), d.getListaEmprestimos());
                }
                if (1 == nowlog.getAutoridade()) {
                    FuncMenu.executarMenuCompleto(d.getListUsuarios(), d.getListLivros(), d.getListaEmprestimos());
                }
                if (2 == nowlog.getAutoridade()) {
                    FuncMenu.executarMenuBibliotecario(d.getListUsuarios(), d.getListLivros(), d.getListaEmprestimos());
                }
                if (3 == nowlog.getAutoridade()) {
                    FuncMenu.executarMenuConsumidor(d.getListLivros(), d.getListaEmprestimos());
                }
            }
        }
            
    }
}

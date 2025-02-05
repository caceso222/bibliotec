package bibliotec;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotec extends Dao {

    public static void main(String[] args) {
        // Arrays para armazenar os objetos
        Usuario nowlog = new Usuario("", 0, "", 0, 0,0);
        Usuario po = new Usuario("po", 0, "777", 0, 0,0);
        
        Dao d = new Dao();
        FuncMenu FuncMenu = new FuncMenu();
        
        listUsuarios.add(po);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        FuncMenu.loginUsuario( listUsuarios);

        if (0 == nowlog.getAutoridade()) {
            FuncMenu.executarMenuCompleto( listUsuarios, listLivros, listaEmprestimos);
        }
        if (1 == nowlog.getAutoridade()) {
            FuncMenu.executarMenuCompleto( listUsuarios, listLivros, listaEmprestimos);
        }
        if (2 == nowlog.getAutoridade()) {
            FuncMenu.executarMenuBibliotecario( listUsuarios, listLivros, listaEmprestimos);
        }
        if (3 == nowlog.getAutoridade()) {
            FuncMenu.executarMenuConsumidor( listLivros, listaEmprestimos);
        }

    }
}

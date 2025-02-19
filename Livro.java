package bibliotec;

<<<<<<< HEAD

import java.time.LocalDate;
=======
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
import java.util.Scanner;

public class Livro {
    
    private int id_livro;
    private int disp;
<<<<<<< HEAD
    private LocalDate datalancamento;
=======
    private String datalancamento;
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    private String genero, titulo, faixaEtaria;
    private int paginas;
    private String autor;
    private int edição;
    LivroDao l = new LivroDao();
    Scanner s = new Scanner(System.in);

<<<<<<< HEAD
    public Livro(int disponibilidade, String titulo, LocalDate ano_lançamento, String gênero, int paginas, String autor, int edição, String faixaet) {
=======
    public Livro(int disponibilidade, String titulo, String ano_lançamento, String gênero, int paginas, String autor, int edição, String faixaet) {
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        this.disp = disponibilidade;
        this.datalancamento = ano_lançamento;
        this.genero = gênero;
        this.paginas = paginas;
        this.autor = autor;
        this.edição = edição;
        this.titulo = titulo;
        this.faixaEtaria = faixaet;
    }
    
    

    public Livro() {
        System.out.println("CATALOGANDO LIVROS");
        System.out.println("Informe o titulo do livro: ");
        titulo = s.nextLine();
        System.out.println("Informe o autor: ");
        autor = s.nextLine();
        System.out.println("Informe o gênero: ");
        genero = s.nextLine();
        System.out.println("Informe a faixa etaria: ");
        faixaEtaria = s.nextLine();
        System.out.println("Informe a data de lançamento: ");
<<<<<<< HEAD
        datalancamento = LocalDate.parse(s.nextLine()); 
=======
        datalancamento = s.nextLine();
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        System.out.println("quantos livros estão disponíveis?]");
        disp = s.nextInt();
        l.inserirlivro(this);
    }
    
    public void Dispm1() {
        
        disp--;
        
}

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Faixa etária: " + faixaEtaria);
        System.out.println("Data de lançamento: " + datalancamento);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Edição: " + edição);
        System.out.println("Disponível: " + disp);
    }

    public void exibirResumo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("livros disponiveis: " + disp);
    }


    public int getDisp() {
        return disp;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }

<<<<<<< HEAD
    public LocalDate getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(LocalDate datalancamento) {
        this.datalancamento = datalancamento;
    }


=======
    public String getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(String datalancamento) {
        this.datalancamento = datalancamento;
    }
    
    
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public LivroDao getL() {
        return l;
    }

    public void setL(LivroDao l) {
        this.l = l;
    }

    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdição() {
        return edição;
    }

    public void setEdição(int edição) {
        this.edição = edição;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

}

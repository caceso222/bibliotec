package bibliotec;

import java.util.Scanner;

public class Livro {

    private int id_livro;
    private int disp;
    private String datalancamento;
    private String genero, titulo, faixaEtaria;
    private int paginas;
    private String autor;
    private int edição;
    Scanner s = new Scanner(System.in);

    public Livro(int id_livro, int disponibilidade, String titulo, String ano_lançamento, String gênero, int paginas, String autor, int edição, String faixaet) {
        this.id_livro = id_livro;
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
        System.out.println("Informe o código: ");
        id_livro = s.nextInt();
        System.out.println("Informe a faixa etaria: ");
        faixaEtaria = s.nextLine();
        System.out.println("Informe a data de lançamento: ");
        datalancamento = s.nextLine();
        System.out.println("quantos livros estão disponíveis?]");
        disp = s.nextInt();
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Código: " + id_livro);
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

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getDisp() {
        return disp;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }

    public String getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(String datalancamento) {
        this.datalancamento = datalancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
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

package bibliotec;

import java.util.Scanner;
import java.time.*;


public class Emprestimo {

    private String consumidor;
    private int cod_livro;
    private LocalDate data_atual;
    private LocalDate data_final;
    private float valor;
    private String bibliotecario_responsavel;
    private int cod_transacao;
    private float valor_multa;
    private boolean devolvido;

    public Emprestimo(boolean devolvido, String consumidor, int cod_livro, LocalDate data_atual, LocalDate data_final,
            float valor, String bibliotecario_responsavel, int cod_transacao, float valor_multa) {
        this.devolvido = devolvido;
        this.consumidor = consumidor;
        this.cod_livro = cod_livro;
        this.data_atual = data_atual;
        this.data_final = data_final;
        this.valor = valor;
        this.bibliotecario_responsavel = bibliotecario_responsavel;
        this.cod_transacao = cod_transacao;
        this.valor_multa = valor_multa;
    }

    Dao d = new Dao();

    public Emprestimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do consumidor: ");
        this.consumidor = scanner.nextLine();

        System.out.print("Digite o código do livro: ");
        this.cod_livro = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, insira a data do empréstimo (ano-mês-dia):");
        this.data_atual = LocalDate.parse(scanner.nextLine()); 

        
        System.out.println("Por favor, insira a data de devolução (ano-mês-dia):");
        this.data_final = LocalDate.parse(scanner.nextLine()); 

        System.out.print("Digite o valor: ");
        this.valor = scanner.nextFloat();

        System.out.print("Digite o nome do bibliotecário responsável: ");
        scanner.nextLine();
        this.bibliotecario_responsavel = scanner.nextLine();

        System.out.print("Digite o código da transação: ");
        this.cod_transacao = scanner.nextInt();

        System.out.print("Digite o valor da multa: ");
        this.valor_multa = scanner.nextFloat();

        this.devolvido = false; // Por padrão, o empréstimo não está devolvido
    }
    public void exibir() {
        System.out.println("Informações do Empréstimo:");
        System.out.println("Consumidor: " + consumidor);
        System.out.println("Data de realização de emprestimo: " + data_atual);
        System.out.println("Data de finalização de emprestimo: " + data_final);
        System.out.println("Valor: " + valor);
        System.out.println("Bibliotecário Responsável: " + bibliotecario_responsavel);
        System.out.println("Código da Transação: " + cod_transacao);
        System.out.println("Valor da Multa: " + valor_multa);
        System.out.println("Devolvido: " + (devolvido ? "Sim" : "Não"));
    }

    public void exibirResumo() {
        System.out.println("Resumo do Empréstimo:");
        System.out.println("Código da Transação: " + cod_transacao);
        System.out.println("Consumidor: " + consumidor);
        System.out.println("Valor: " + valor);
    }

    public void multa(Scanner scanner) {

        System.out.println("data de final prevista:" + data_final);

        System.out.print("Quantos dias de atraso houveram (caso não tenha tido nenhum, digite 0): ");
        int dias_atraso = scanner.nextInt();

        float valor_inicial = 10.0f;
        float juros = 2.50f;
        float multa = (juros * dias_atraso) + valor_inicial;

        System.out.println("Valor da multa: " + multa);

    }

    public String getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(String consumidor) {
        this.consumidor = consumidor;
    }

    public LocalDate getData_atual() {
        return data_atual;
    }

    public void setData_atual(LocalDate data_atual) {
        this.data_atual = data_atual;
    }

    public LocalDate getData_final() {
        return data_final;
    }

    public void setData_final(LocalDate data_final) {
        this.data_final = data_final;
    }

    public Dao getD() {
        return d;
    }

    public void setD(Dao d) {
        this.d = d;
    }



    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    public String getBibliotecario_responsavel() {
        return bibliotecario_responsavel;
    }

    public void setBibliotecario_responsavel(String bibliotecario_responsavel) {
        this.bibliotecario_responsavel = bibliotecario_responsavel;
    }

    public int getCod_transacao() {
        return cod_transacao;
    }

    public void setCod_transacao(int cod_transacao) {
        this.cod_transacao = cod_transacao;
    }

    public float getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(float valor_multa) {
        this.valor_multa = valor_multa;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

}

package bibliotec;

import java.util.Scanner;

public class Emprestimo {

    private String consumidor;
    private int cod_livro;
    private String data_atual;
    private String data_final;
    private float valor;
    private String bibliotecario_responsavel;
    private int cod_transacao;
    private float valor_multa;
    private boolean devolvido;

        public Emprestimo(boolean devolvido, String consumidor, int livro, String data_atual, String data_final, float valor, String bibliotecario_responsavel, int cod_transacao, float valor_multa) {
        this.consumidor = consumidor;
        this.cod_livro = livro;
        this.data_atual = data_atual;
        this.data_final = data_final;
        this.valor = valor;
        this.bibliotecario_responsavel = bibliotecario_responsavel;
        this.cod_transacao = cod_transacao;
        this.valor_multa = valor_multa;
        this.devolvido = devolvido;
    }


    public Emprestimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do consumidor: ");
        this.consumidor = scanner.nextLine();

        System.out.print("Digite o código do livro: ");
        this.cod_livro = scanner.nextInt();

        System.out.print("Digite a data atual: ");
        scanner.nextLine(); // Limpar o buffer
        this.data_atual = scanner.nextLine();

        System.out.print("Digite a data de devolução do empréstimo: ");
        this.data_final = scanner.nextLine();

        System.out.print("Digite o valor: ");
        this.valor = scanner.nextFloat();

        System.out.print("Digite o nome do bibliotecário responsável: ");
        scanner.nextLine(); // Limpar o buffer
        this.bibliotecario_responsavel = scanner.nextLine();

        System.out.print("Digite o código da transação: ");
        this.cod_transacao = scanner.nextInt();

        System.out.print("Digite o valor da multa: ");
        this.valor_multa = scanner.nextFloat();

        
        
        this.devolvido = false;
        
        
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
       
        System.out.println("data de final prevista:"+data_final);
        
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

    public String getData_atual() {
        return data_atual;
    }

    public void setData_atual(String data_atual) {
        this.data_atual = data_atual;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
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

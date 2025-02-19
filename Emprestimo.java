package bibliotec;

import java.util.Scanner;
<<<<<<< HEAD
import java.time.*;

=======
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

public class Emprestimo {

    private String consumidor;
    private int cod_livro;
<<<<<<< HEAD
    private LocalDate data_atual;
    private LocalDate data_final;
=======
    private String data_atual;
    private String data_final;
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    private float valor;
    private String bibliotecario_responsavel;
    private int cod_transacao;
    private float valor_multa;
    private boolean devolvido;

<<<<<<< HEAD
    public Emprestimo(boolean devolvido, String consumidor, int cod_livro, LocalDate data_atual, LocalDate data_final,
            float valor, String bibliotecario_responsavel, int cod_transacao, float valor_multa) {
        this.devolvido = devolvido;
        this.consumidor = consumidor;
        this.cod_livro = cod_livro;
=======
        public Emprestimo(boolean devolvido, String consumidor, int livro, String data_atual, String data_final, float valor, String bibliotecario_responsavel, int cod_transacao, float valor_multa) {
        this.consumidor = consumidor;
        this.cod_livro = livro;
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        this.data_atual = data_atual;
        this.data_final = data_final;
        this.valor = valor;
        this.bibliotecario_responsavel = bibliotecario_responsavel;
        this.cod_transacao = cod_transacao;
        this.valor_multa = valor_multa;
<<<<<<< HEAD
    }

    Dao d = new Dao();
=======
        this.devolvido = devolvido;
    }

        Dao d = new Dao();
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

    public Emprestimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do consumidor: ");
        this.consumidor = scanner.nextLine();

        System.out.print("Digite o código do livro: ");
        this.cod_livro = scanner.nextInt();
<<<<<<< HEAD
        scanner.nextLine(); 

        System.out.println("Por favor, insira a data do empréstimo (ano-mês-dia):");
        this.data_atual = LocalDate.parse(scanner.nextLine()); 

        
        System.out.println("Por favor, insira a data de devolução (ano-mês-dia):");
        this.data_final = LocalDate.parse(scanner.nextLine()); 
=======

        System.out.print("Digite a data atual: ");
        scanner.nextLine(); // Limpar o buffer
        this.data_atual = scanner.nextLine();

        System.out.print("Digite a data de devolução do empréstimo: ");
        this.data_final = scanner.nextLine();
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

        System.out.print("Digite o valor: ");
        this.valor = scanner.nextFloat();

        System.out.print("Digite o nome do bibliotecário responsável: ");
        scanner.nextLine();
        this.bibliotecario_responsavel = scanner.nextLine();

        System.out.print("Digite o código da transação: ");
        this.cod_transacao = scanner.nextInt();

        System.out.print("Digite o valor da multa: ");
        this.valor_multa = scanner.nextFloat();

<<<<<<< HEAD
        this.devolvido = false; // Por padrão, o empréstimo não está devolvido
    }
=======
        //d.getLivroId(cod_livro).Dispm1();
        //resolver no sql
        
        this.devolvido = false;
        
        
    }

>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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

<<<<<<< HEAD
=======
        
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    public void exibirResumo() {
        System.out.println("Resumo do Empréstimo:");
        System.out.println("Código da Transação: " + cod_transacao);
        System.out.println("Consumidor: " + consumidor);
        System.out.println("Valor: " + valor);
    }
<<<<<<< HEAD

    public void multa(Scanner scanner) {

        System.out.println("data de final prevista:" + data_final);

        System.out.print("Quantos dias de atraso houveram (caso não tenha tido nenhum, digite 0): ");
        int dias_atraso = scanner.nextInt();

        float valor_inicial = 10.0f;
        float juros = 2.50f;
=======
    
    public void multa(Scanner scanner) {
       
        System.out.println("data de final prevista:"+data_final);
        
        System.out.print("Quantos dias de atraso houveram (caso não tenha tido nenhum, digite 0): ");
        int dias_atraso = scanner.nextInt();

        float valor_inicial = 10.0f; 
        float juros = 2.50f; 
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
        float multa = (juros * dias_atraso) + valor_inicial;

        System.out.println("Valor da multa: " + multa);

    }

<<<<<<< HEAD
=======
    
    
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    public String getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(String consumidor) {
        this.consumidor = consumidor;
    }

<<<<<<< HEAD
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


=======
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

  
>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567

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

<<<<<<< HEAD
=======
  

>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
    public String getBibliotecario_responsavel() {
        return bibliotecario_responsavel;
    }

    public void setBibliotecario_responsavel(String bibliotecario_responsavel) {
        this.bibliotecario_responsavel = bibliotecario_responsavel;
    }

<<<<<<< HEAD
=======


>>>>>>> 73ce2563e9390bb05febbb0a31d6839f8b0df567
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

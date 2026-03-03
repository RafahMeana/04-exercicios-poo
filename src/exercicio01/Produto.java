package exercicio01;

public class Produto {
    String nome;
    double valor;
    int quantidade;


    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }



    public void aumentarValor(double porcentagem) {
        if (porcentagem > 0) {
            this.valor += this.valor * (porcentagem / 100);
            System.out.println("O valor de " + nome + " foi reajustado com sucesso!");
        } else {
            System.out.println("Porcentagem inválida para aumento.");
        }
    }

    public void exibirDetalhes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d unidades%n",
                nome, valor, quantidade);
    }
}
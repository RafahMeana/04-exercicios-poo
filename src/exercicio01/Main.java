package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;

        System.out.println("NOME DO PRODUTO --->");
        nome = sc.next();
        System.out.println("VALOR DO PRODUTO --->");
        valor = sc.nextDouble();
        System.out.println("QUANTIDADE EM ESTOQUE --->");
        quantidade = sc.nextInt();
        Produto p = new Produto(nome, valor, quantidade);

        //porcentagem de aumento
        System.out.println("qual a porcentagem de aumento do valor do produto?");
        double porcentagem = sc.nextDouble();

        p.aumentarValor(porcentagem);
        System.out.println(p.valor);

        sc.close();
    }
}

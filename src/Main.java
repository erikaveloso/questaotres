import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque antes da venda: ");
        int estoque = sc.nextInt();

        Estoque produto = new Estoque(nome, preco, estoque);

        System.out.print("Venda realizada: ");
        int quantidadeVendida = sc.nextInt();
        produto.vender(quantidadeVendida);

        produto.exibirInformacoes();
        sc.close();
    }
}
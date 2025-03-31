public class Estoque {
    private String nome;
    private double preco;
    private int estoque;

    public Estoque(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + estoque);
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > estoque) {
            System.out.println("\nEstoque insuficiente para realizar a venda.");
        } else {
            estoque -= quantidadeVendida;
            System.out.println("\nVenda realizada com sucesso!");
        }
    }
}
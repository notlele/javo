package Carrinho;

public class TestaCarrinho {
    public static void main(String[] args) {
        Livro livro = new Livro(1,18.5,"livrao","fdfdsfds","234442-f");
        DVD dvd = new DVD(23,10.9,"filme","fox");
        Servico service = new Servico("defsgfh",45,24,30);

        Carrinho cart = new Carrinho();
        cart.adicionaVendavel(livro);
        cart.adicionaVendavel(dvd);
        cart.adicionaVendavel(service);

        cart.exibeItensCarrinho();
        System.out.println("Valor total venda = " + cart.calculaTotalVenda());
    }
}

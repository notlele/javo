package Carrinho;

import java.util.ArrayList;

public class Carrinho {


    private ArrayList<Vendavel> cart;

    public Carrinho() {
        cart = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel v) {
        cart.add(v);
    }

    public double calculaTotalVenda() {
        double total = 0;
        for (Vendavel v : cart) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        System.out.println("\nLista de itens");
        for (Vendavel t : cart) {
            System.out.println(t);
        }
    }

    public ArrayList<Vendavel> getLista() {
        return cart;
    }
    public void setLista(ArrayList<Vendavel> cart) {
        this.cart = cart;
    }
}

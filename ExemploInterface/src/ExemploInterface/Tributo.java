package ExemploInterface;

import java.util.ArrayList;

public class Tributo {
    private ArrayList<Tributavel> lista;

    public Tributo() {
        lista = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t) {
        lista.add(t);
    }

    public double calculaTotalTributo() {
        double total = 0;
        for (Tributavel t : lista) {
            total += t.getValorTributo();
        }
        return total;
    }

    public void exibeTodos() {
        System.out.println("\nLista de tributáveis");
        for (Tributavel t : lista) {
            System.out.println(t);
        }
    }

    public ArrayList<Tributavel> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Tributavel> lista) {
        this.lista = lista;
    }
}

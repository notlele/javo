package ExemploInterface;

public class Alimento extends Produto implements Tributavel {
    private int quantVitamina;

    @Override
    public double getValorTributo() {
        return getPreco() * 0.15;
    }

    public Alimento(int codigo, String descricao, double preco, int quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    public int getQuantVitamina() {
        return quantVitamina;
    }

    public void setQuantVitamina(int quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }

}

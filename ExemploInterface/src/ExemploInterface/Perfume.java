package ExemploInterface;

public class Perfume extends Produto implements Tributavel {
    private String fragrancia;

    public Perfume(int codigo, String descricao, double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }
    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public double getValorTributo() {
        return getPreco() * 0.17;
    }
}

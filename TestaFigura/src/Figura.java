public abstract class Figura {
    private String cor;
    private int expessura;


    public abstract double calculaArea() {
        return conta;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", expessura=" + expessura +
                '}';
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getExpessura() {
        return expessura;
    }

    public void setExpessura(int expessura) {
        this.expessura = expessura;
    }

    public double calculaArea() {
        return base * altura;
    }

}

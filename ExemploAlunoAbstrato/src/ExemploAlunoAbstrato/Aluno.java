package ExemploAlunoAbstrato;

public abstract class Aluno {
    // atributos
    private int ra;
    private String nome;
    private double nota1;
    private double nota2;

    //construtor
    public Aluno (int ra, String nome, double nota1, double nota2) {
        setRa(ra);
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
    }

    @Override
    public String toString() {
        return  "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", media=" + String.format("%.2f",calculaMedia()) +
                ", nota1=" + nota1 +
                ", nota2=" + nota2;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calculaMedia() {
        return (nota1 + nota2 / 2);
    }
}

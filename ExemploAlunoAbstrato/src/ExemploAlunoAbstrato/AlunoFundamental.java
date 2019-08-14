package ExemploAlunoAbstrato;

public class AlunoFundamental extends Aluno {
    private double nota3;
    private double nota4;

    public AlunoFundamental(int ra, String nome, double nota1, double nota2, double nota3, double nota4) {
        super(ra, nome, nota1, nota2);
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{" + super.toString() +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                "} ";
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    @Override
    public double calculaMedia() {
        return super.calculaMedia() + (nota3 + nota4 / 2);
    }
}

package ExemploAlunoAbstrato;

public class AlunoPos extends Aluno {
    private double notaMonografia;

    public AlunoPos(int ra, String nome, double nota1, double nota2, double notaMonografia) {
        super(ra, nome, nota1, nota2);
        setNotaMonografia(notaMonografia);
    }

    @Override
    public String toString() {
        return "AlunoPos={" + super.toString() +
                ", notaMonografia=" + notaMonografia +
                "}";
    }

    public double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
}

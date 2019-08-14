package ExemploAlunoAbstrato;

public class AlunoGraduacao extends Aluno {

    //construtor
    public AlunoGraduacao (int ra, String nome, double nota1, double nota2) {
        super(ra, nome, nota1, nota2);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{} " + super.toString() +
                "} ";
    }

    @Override
    public double calculaMedia() {
        return getNota1() * 0.4 + getNota2() * 0.6;
    }
}

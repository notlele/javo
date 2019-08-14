package ExemploAlunoAbstrato;

public class ExemploAlunoAbstrato {

    public static void main(String[] args) {

        AlunoFundamental af = new AlunoFundamental(12345,"Luiz Silva", 8,4,5,6);
        System.out.println(af.toString());

        AlunoGraduacao ag = new AlunoGraduacao(12345,"asaasd", 12,13);
        System.out.println(ag.toString());
    }
}

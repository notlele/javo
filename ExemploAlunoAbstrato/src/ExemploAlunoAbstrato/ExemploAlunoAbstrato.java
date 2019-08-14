package ExemploAlunoAbstrato;

public class ExemploAlunoAbstrato {

    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental(12345,"Luiz Silva", 8,4,5,6);
        System.out.println(af.toString());

        AlunoGraduacao ag = new AlunoGraduacao(35323,"asaasd", 12,13);
        System.out.println(ag.toString());

        AlunoPos ap = new AlunoPos(15645, "dsadgfhg",8,7,4);
        System.out.println(ap.toString());

        Cadastro cad = new Cadastro();

        cad.adicionaAluno(af);
        cad.adicionaAluno(ag);
        cad.adicionaAluno(ap);
        cad.exibeTodos();
        cad.exibeAlunoGraduacao();

        Aluno a = cad.buscaAluno(15645);
    }
}

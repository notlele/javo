package ExemploAlunoAbstrato;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cadastro {
    ArrayList<Aluno> lista;
    public Cadastro() {
        lista = new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno a) {
        lista.add(a);
    }

    public void exibeTodos() {
        System.out.println("\nLista de alunos:");
        for (Aluno a : lista) {
            System.out.println(a);
        }
    }

    public void exibeAlunoGraduacao() {
        System.out.println("\nLista de alunos de graduação:");
        for (Aluno a : lista) {
            if (a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    public Aluno buscaAluno(int ra) {
        for (Aluno a : lista) {
            if (a.getRa() == ra) {
                return a;
            }
            return null;
        }
        return null;
    }
}

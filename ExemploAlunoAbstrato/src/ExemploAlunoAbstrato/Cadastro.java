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
}

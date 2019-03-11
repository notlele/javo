/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodo;

/**
 *
 * @author Aluno
 */
public class Aluno {
    // atributos
    String nome;
    int ra;
    double nota;
    int qtdFalta;
    boolean aprovado;
    
    // metodos
    public void verNota() {
        System.out.println("A nota é " + nota);
    }
    
    public void verFalta() {
        System.out.println("A quantidade de faltas é " + qtdFalta);
    }
    
}

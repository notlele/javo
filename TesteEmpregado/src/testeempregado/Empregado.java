/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeempregado;

/**
 *
 * @author Aluno
 */
public class Empregado {
    String nome;
    String cargo;
    float salario;
    
    public void reajustarSalario(int ajuste) {
        salario = salario + (salario * ajuste / 100);
    }
}

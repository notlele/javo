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

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado Joao = new Empregado();
        
        Joao.nome = "João";
        Joao.cargo = "Analista de Sistemas";
        Joao.salario = 5400;
        Joao.reajustarSalario(15);
        
        System.out.println(Joao.nome + ", " + Joao.cargo + ", salário reajustado para R$" + Joao.salario + ".");
        
        Empregado Ana = new Empregado();
        Ana.nome = "Ana";
        Ana.cargo = "Analista de Processos";
        Ana.salario = 4600;
        Ana.reajustarSalario(5);
        
        System.out.println(Ana.nome + ", " + Ana.cargo + ", salário reajustado para R$" + Ana.salario + ".");
        
    }
    
}


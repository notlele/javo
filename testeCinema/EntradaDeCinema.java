/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecinema;

/**
 *
 * @author Aluno
 */
public class EntradaDeCinema {
    int ano;
    int hora;
    int sala;
    float valor;
    String nome;
    
    public void calculaDesconto(int idade, boolean estudante) {
        int desconto;
        if (idade <= 12) {
            desconto = 50;
        }
        else if (idade > 12 && idade <= 15 && estudante == true) { 
            desconto = 40;
        }
        else if (idade >= 16 & idade <= 20 && estudante == true) {
            desconto = 30;
        }
        
        else if (idade > 20 && estudante == true) {
            desconto = 20;
        }
        
    }
}

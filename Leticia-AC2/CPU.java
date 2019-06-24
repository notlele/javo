/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leticia.ac2;

/**
 *
 * @author Aluno
 */
public class CPU {
    String modelo;
    double usoAtual;
    double valorAlerta;
    
    public void aumentaConsumo(double consumo){
        if (usoAtual < 100 && usoAtual + consumo <= 100) {
            usoAtual += consumo;
        }
        else {
            usoAtual = 100;
        }
    }
    
    public void diminuiConsumo() {
        if (usoAtual - 10 <= 0 || usoAtual == 0) {
            usoAtual = 0;
        }
        else {
            usoAtual -= 10;
        }
    }
    
    public void infoAtual() {
        if (usoAtual >= valorAlerta) {
            System.out.println(modelo + ", uso atual: " + usoAtual + ", uso acima da média estabelecida (" + valorAlerta + ").");
        }
        
        else {
            System.out.println(modelo + ", uso atual: " + usoAtual + ", uso dentro da média estabelecida (" + valorAlerta + ").");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leticia.ac2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LeticiaAC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        CPU i3 = new CPU();
        i3.modelo = "i3 7300";
        i3.usoAtual = 70;
        i3.valorAlerta = 88;
        
        double consumo;
        
        do {
            System.out.println("Insira o valor para aumentar o uso da CPU:");
            consumo = scaner.nextDouble();
            i3.aumentaConsumo(consumo);
        } while (consumo < 0);
        
        i3.infoAtual();
        
        do {
            System.out.println("Insira o valor para aumentar o uso da CPU:");
            consumo = scaner.nextDouble();
            i3.aumentaConsumo(consumo);
        } while (i3.usoAtual < i3.valorAlerta);
        
        i3.diminuiConsumo();
        i3.infoAtual();
        
        
    }
    
}

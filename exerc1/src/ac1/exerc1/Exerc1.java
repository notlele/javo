/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac1.exerc1;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */


public class Exerc1 {

    
    /**
     * @param args the command line arguments
     */
    
    
        
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        System.out.println("Digite uma quantidade:");
        int qtd = scaner.nextInt();
        contPares(qtd); 
    }
    
    private static void contPares(int qtd) {
        Scanner scaner = new Scanner (System.in);
        int n = 0;
        int pares=0;
        int impares=0;
        for (int i=qtd;i>0;i--) {
            System.out.println("Digite um numero: ");
            n = scaner.nextInt();
            if (n % 2 == 0) {
                pares++;
            }
            else if (n%2!=0){
                impares++;
            }
        }
        System.out.println("Total de numeros: \nPares: " + pares + "\nImpares = " + impares);
    }

    
}
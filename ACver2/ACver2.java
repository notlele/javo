/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac1.pkg01182028;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */


public class ACver2 {

    private static void exibeNum(int num) {
        for (int i=0;num>0;i++) {
            num--;
            System.out.println(num);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner (System.in);
        System.out.println("Digite um valor inteiro maior que zero:");
        int op = scaner.nextInt();
        
        switch (op) {
            case 1: System.out.println("Digite um número inteiro:");
                int num = scaner.nextInt();
                exibeNum(num);
                break;

            case 2:
                int voto = 0;
                int voto100 = 0;
                int voto200 = 0;
                for (int x=0;x<8;x++) {
                    System.out.println("Digite 100 para votar em \"Quero aula de Python\" ou 200 para votar em \"Não quero aula de Python\"");
                    voto = scaner.nextInt();
                    switch (voto) {
                        case 100:
                            voto100++;
                            break;
                        case 200:
                            voto200++;
                            break;
                        default:
                            System.out.println("Digite 100 para votar em \"Quero aula de Python\" ou 200 para votar em \"Não quero aula de Python\"");
                            voto = scaner.nextInt();
                            break;
                    }
                }
                if (voto100 > voto200) { 
                    System.out.println("\"Quero aula de Python\" ganhou com " + voto100 + " votos");
                }
                
                else if (voto200 > voto100) { 
                    System.out.println("\"Não quero aula de Python\" ganhou com " + voto200 + " votos");
                }
                else {
                    System.out.println("Empate");
                }
                break;
            case 3:
                int nr = 0;
                int total = 0;
                for (int y=0;y<8;y++) {
                    System.out.println("Insira 8 numeros");
                    nr = scaner.nextInt();
                    if (nr%2!=0) {
                        total = total + nr;
                    }
                }
                System.out.println("Soma dos numeros impares = " + total);
                break;
            default: System.out.println("Numero inválido!");
                break;
        }
    }

    
}

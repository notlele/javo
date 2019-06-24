/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02.pkg01182028;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class P0201182028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        System.out.println("Digite um valor inteiro maior que zero:");
        int op = scaner.nextInt();
        
        switch (op) {
            case 1: 
                System.out.println("Digite usuário: ");
                String usuario = scaner.nextLine();
                System.out.println("Digite senha: ");
                String senha = scaner.nextLine();
                if (usuario.length() != 8 || senha.length() != 11) {
                    System.out.println("Login inválido");
                }
                else {
                    System.out.println("Bem vindo!");
                }
                break;
            
            case 2:
                int mult4 = 0;
                for (int i=0;i<8;i++) {
                    System.out.println("Insira um numero: ");
                    int num = scaner.nextInt();
                    if (num%4==0) {
                        mult4++;
                    }
                }
                System.out.println(mult4 + " numeros multiplos de 4");
                break;
                
            case 3:
                int x;
                int total = 0;
                int cont = 0;
                do {
                    System.out.println("Digite um número inteiro:");
                    x = scaner.nextInt();
                    if (x >= 0) {
                        total+=x;
                        cont++;
                    }
                } while (x >= 0);
                int media = total / cont;
                System.out.println("Media = " + media);
                break;
                
            default:
                System.out.println("Numero inválido");
                break;
        }
    }
}
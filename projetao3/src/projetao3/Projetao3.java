/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetao3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Projetao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // leitor de input
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1 para domingo, 2 para segunda, etc)");
        // lê input da pergunta anterior
        int dia = leitor.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Segunda");
                break;
            case 3: System.out.println("Terça");
                 break;
            case 4: System.out.println("Quarta");
                 break;
            case 5: System.out.println("Quinta");
                 break;
            case 6: System.out.println("Sexta");
                 break;
            case 7: System.out.println("Sábado");
                 break;
            default: System.out.println("Número inválido");
                 break;
        }
        
        System.out.println("Digite a colocação: \na- 1º lugar: ganha iPad, iPhone, iPod \nb- 2º lugar: ganha iPhone, iPod \nc- 3º lugar: ganha iPod");
        char lugar = leitor.next().charAt(0);
        
        System.out.println("Você ganhou ");
        switch (lugar) {
            case 'a': System.out.print("iPad, ");
            case 'b': System.out.print("iPhone e ");
            case 'c': System.out.println("iPod.");
                break;
            default: System.out.println("Colocação inválida");
                break;
        }
        
        
        for (int cont=1;cont <= 5;cont++) {
            System.out.println("boa noite via for");
        }
        
        int cont=1;
        do {
            System.out.println("boa noite com do/while");
            cont++;
        } while (cont <= 5);
        
        System.out.println("Digite o nome da sua faculdade: ");
        String fac = leitor.next();
        if (fac.equals("Bandtec")) {
            System.out.println("Parabéns/! ótima escolha");
        }
        else {
            System.out.println("vem pra Bandtec");
        }
    }
    
}

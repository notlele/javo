/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprogrsama;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class aula02 {
    
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
    /*
        System.out.println("Quantos amigos vão rachar a pizza? ");
        int amigos = scaner.nextInt();
        String sabor = scaner.nextLine();
        System.out.println("Qual o sabor da pizza? ");
        sabor = scaner.nextLine();
        System.out.println("Qual o valor da pizza? ");
        float vlr = scaner.nextInt();
        System.out.println("Qual o valor máximo para rachar? ");
        float racharmax = scaner.nextInt();
        
        float rachar = vlr / amigos;
        float totalmax = racharmax * amigos;
        
        if (rachar <= racharmax) {
            System.out.println("A pizza de " + sabor + " custa R$" + vlr + " e cada amigo vai pagar R$" + rachar);
        }
        else {
            System.out.println("Deu ruim no racha. A pizza deveria custar no máximo R$" + totalmax);
        }
        
        // -----------------------------------------------------------
        
        System.out.println("Qual o nome do responsável pela família?");
        String responsavel = scaner.nextLine();
        System.out.println("Qual a cidade de residência?");
        String cidade = scaner.nextLine();
        System.out.println("Há quantos filhos menores de 18?");
        int filhos = scaner.nextInt();
        System.out.println("Há quantos filhos PNE?");
        int pne = scaner.nextInt();
        System.out.println("Há quantos idosos (60+)?");
        int idosos = scaner.nextInt();
        
        double vlr18 = filhos * 12.50;
        int vlrpne = pne * 14;
        int vlridoso = idosos * 10;
        double total = vlr18 + vlrpne + vlridoso;
        
        
        System.out.println("A família do responsável " + responsavel + " vai receber um total de R$" + total + " por mês \n- Valor pelos menores de 18 anos: R$"
        + vlr18 + "\n- Valor pelos PNE: R$" + vlrpne + "\n- Valor pelos idosos: R$" + vlridoso + "\n - Cidade: " + cidade);
    
        // -----------------------------------------------------------
        
        System.out.println("Insira o 1º nome: ");
        String nome1 = scaner.nextLine();
        System.out.println("Insira a altura do 1º: ");
        double altura1 = scaner.nextInt();
        System.out.println("Insira o 2º nome: ");
        String nome2 = scaner.nextLine();
        System.out.println("Insira a altura do 2º: ");
        double altura2 = scaner.nextInt();
        
        if (altura1 > altura2) {
            System.out.println(nome1 + " é mais alto que " + nome2 + "(" + altura1 + " x " + altura2 + ")");
        }
        else if (altura2 > altura1) {
            System.out.println(nome2 + " é mais alto que " + nome1 + "(" + altura2 + " x " + altura1 + ")");
        }
        else {
            System.out.println("Os dois têm a mesma altura.");   
        }
    */
    
        System.out.println("Qual o valor da conta do restaurante?");
        int conta = scaner.nextInt();
        System.out.println("Você vai pagar os 10%? \n1 - SIM | 2 - NAO");
        int tip = scaner.nextInt();
        double total = conta + conta * 10/100;
        
        switch (tip) {
            case 1: System.out.println("Total a pagar R$" + total);
            case 2: System.out.println("Total a pagar R$" + conta);
        }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leticia.ac3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LeticiaAC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Scanner txtReader = new Scanner(System.in);
        Medico medico = new Medico();

        int crm;
        String nome;
        int qtdConsulta;
        double valorConsulta;
        
        System.out.println("Digite o numero do crm");
        crm = scaner.nextInt();
        
        System.out.println("Digite o nome");
        nome = txtReader.nextLine();
        
        do {
            System.out.println("Digite a quantidade de consultas");
            qtdConsulta = scaner.nextInt();
        } while (qtdConsulta < 0);
        
        do {
            System.out.println("Digite o valor da consulta");
            valorConsulta = scaner.nextDouble();
        } while (valorConsulta < 0);
        
        medico.setCrm(crm);
        medico.setNome(nome);
        medico.setQtdConsulta(qtdConsulta);
        medico.setValorConsulta(valorConsulta);
        
        System.out.println("O medico " + medico.getNome() + " teve ganho de R$" + medico.calculaGanho());
        System.out.println(medico.toString());
        
        //MEDICO2
        
        System.out.println("Digite o numero do crm");
        crm = scaner.nextInt();
        
        System.out.println("Digite o nome");
        nome = txtReader.nextLine();
        
        do {
            System.out.println("Digite a quantidade de consultas");
            qtdConsulta = scaner.nextInt();
        } while (qtdConsulta < 0);
        
        do {        
        System.out.println("Digite o valor da consulta");
        valorConsulta = scaner.nextDouble();
        } while (valorConsulta < 0);
        
        Medico medico2 = new Medico(crm,nome,qtdConsulta,valorConsulta);
        
        
        System.out.println("O medico " + medico2.getNome() + " teve ganho de R$" + medico2.calculaGanho());
        System.out.println(medico2.toString());
        
        
        
        //CIRURGIAO
        MedicoCirurgiao cirurgiao = new MedicoCirurgiao(13890,"Julio",40,120,20,1000);
        
        System.out.println("O medico cirurgião " + cirurgiao.getNome() + " teve ganho de R$" + cirurgiao.calculaGanho());
        System.out.println(cirurgiao.toString());
    }    
}

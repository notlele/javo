/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedata;

/**
 *
 * @author Aluno
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    public void iniciaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes > 12 || mes < 1) {
            System.out.println("Data inválida");
            dia = 0;
            mes = 0;
            ano = 0;
        }
        else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    public void exibeData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
    public void comparaData(int dia, int mes, int ano) {
        if (dia == this.dia && mes == this.mes && ano == this.ano) {
            System.out.println("Datas iguais");
        }
        else {
            System.out.println("Datas diferentes");
        }
    }
}
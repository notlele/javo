/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodoretorno;

/**
 *
 * @author Aluno
 */
public class ExemploMetodoRetorno {

    public static void exibeSoma(int a, int b) {
        int soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);
    }
    
    public static int soma(int a, int b) {
        int soma = a + b;
        return soma;
        // return a + b;
    }
    
    public static int media(int a, int b) {
        return (a + b) / 2;
    }
    
    public static double media(double a, double b) {
        return (a + b) / 2;
    }
    
    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    
    
    public static int operacaoAritmetica(int a, int b, String op) {
        if (op.equals("soma")) {
            return a + b;
        }
        else if (op.equals("multiplicação")) {
            return a * b;
        }
        return -99999;
    }
    
    public static int maior(int x, int y) {
        if (x >= y) {
            return x;
        }
        return y;
    }
    
    public static void main(String[] args) {
        exibeSoma(5,7);
        exibeSoma(23,30);
        // metodo com retorno tem que ser atribuido p uma variavel;
        // soma(8,4) retorna o valor mas o mesmo é ignorado;
        
        int res = soma(8,4);
        System.out.println(res);
        int teste = maior(9,8);
        System.out.println(teste);
        System.out.println("A media entre 5 e 6 é " + media(5,6));
        System.out.println("A media entre 5.4 e 6.7 é " + media(5.4,6.5));
        System.out.println("A media entre 5, 6 e 7 é " + media(5,6,7));
        
        System.out.println("6 * 7 = " + operacaoAritmetica(6,7,"multiplicação"));
    }
    
}
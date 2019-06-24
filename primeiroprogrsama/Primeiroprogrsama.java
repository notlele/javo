package primeiroprogrsama;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Primeiroprogrsama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* String Comida="fome";
        System.out.println("eu to com sono");
        System.out.print("19h comere \t\t\n\n" + Comida);   
        System.out.println("dassdsda"); */
        
        Scanner scaner = new Scanner(System.in);
        /*
        System.out.println("Qual é o seu nome?");
        String nome = scaner.nextLine();
        System.out.println("Olá, " + nome + ", qual o ano de seu nascimento?");
        int datanasc = scaner.nextInt();
        System.out.println("Em 2020 você terá " + (2020-datanasc) + " anos");
        
        
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("Quantas unidades deseja comprar?");
        int unidades = scaner.nextInt();
        System.out.println("Digite o preço de uma unidade:");
        float vlrunid = scaner.nextInt();
        System.out.println("O valor de sua compra é R$ " + (unidades*vlrunid));
        
        
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("Digite o seu salário: ");
        float salario = scaner.nextInt();
        System.out.println("Digite a porcentagem de imposto a ser paga: ");
        int imposto = scaner.nextInt();
        float conta = salario * imposto/100;
        float liquido = salario - conta;
        System.out.println("Salario liquido: R$ " + liquido);
        
        System.out.println("Digite a nota da avaliação continuada:");
        float notacont = scaner.nextInt();
        System.out.println("Digite a nota da avaliação oficial:");
        float nota = scaner.nextInt();
        double media = (notacont * 0.4) + (nota * 0.6) ;
        
        if (media > 5) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        
        
        System.out.println("Numero 1: ");
        float nr1 = scaner.nextInt();
        System.out.println("Numero 2: ");
        float nr2 = scaner.nextInt();
        
        if (nr1 > nr2) {
            int resultado = (int) (nr1 - nr2);
            System.out.println("A diferença entre os números é " + resultado);
        }
        
        else {
            int resultado = (int) (nr2 - nr1);
        System.out.println("A diferença entre os números é " + resultado);
        }
        
        
        int idade;
        int a,b;
        
        System.out.print("type ur age: ");
        idade = scaner.nextInt();
        System.out.println("idade: " + idade);
        
        System.out.println("Digite sua idade");
        if(idade >= 18) {
            System.out.println("ja pode beber");
        }
        else {
            System.out.println("so pode beber escondidos");
        }
        */
        
        System.out.println("Numero 1: ");
        int n1 = scaner.nextInt();
        System.out.println("Numero 2: ");
        int n2 = scaner.nextInt();
        System.out.println("Numero 3: ");
        int n3 = scaner.nextInt();
        
        if (n1 == n2 && n1 == n3 && n2 == n3) {
            System.out.println("É um triângulo equilátero");
        }
        else if (n1 != n2 && n1 != n3 && n2 != n3 ) {
            System.out.println("É um triângulo escaleno");
        }
        else if (n1 == n2 && n2 != n3 || n2 == n3 && n1 != n3) {
            System.out.println("É um triângulo isósceles");
        }
    }
    
   
    
}
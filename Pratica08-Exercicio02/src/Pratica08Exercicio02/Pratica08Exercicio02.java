package Pratica08Exercicio02;

import java.util.Scanner;
import java.util.Stack;

public class Pratica08Exercicio02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Cria uma pilha para armazenar Integer
		Stack<Integer> pilha = new Stack<Integer>();
		
		// Solicita que o usuário digite o número a ser convertido
		// para binário
		System.out.println("Digite o número para ser convertido para binário");
		// Lê o valor digitado
		int num = leitor.nextInt();
		
		// Enquanto o num digitado for diferente de zero
		while (num != 0) {
			// Empilha o resto de num por 2
			pilha.push(num % 2);
			// Atribui para num o resultado de num dividido por 2
			num = num / 2;
		}
		
		// Enquanto a pilha não está vazia
		while (!pilha.isEmpty()) {
			// Desempilha e exibe um valor
			System.out.print(pilha.pop());
		}
		System.out.println();
	}
}

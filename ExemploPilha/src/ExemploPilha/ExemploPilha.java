package ExemploPilha;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		// cria um objeto pilha da classe Stack para armazenar Integer
		Stack <Integer> pilha = new Stack<Integer>();

		// empilha valores na pilha
		pilha.push(5);
		pilha.push(15);
		pilha.push(2);
		
		// exibe a pilha
		System.out.println(pilha);
		
		// exibe o topo da pilha, sem desempilhar
		System.out.println("Topo da pilha: " + pilha.peek());
		
		// exibe a pilha
		System.out.println(pilha);
		
		// desempilha um valor
		System.out.println("Desempilhou: " + pilha.pop());

		// exibe a pilha
		System.out.println(pilha);
		
		// empilha mais valores
		pilha.push(10);
		pilha.push(30);
		
		// exibe a pilha
		System.out.println(pilha);
		
		// Enquanto a pilha não está vazia
		while (!pilha.isEmpty()) {
			// Desempilha e exibe o valor desempilhado
			System.out.println("Desempilhou: " + pilha.pop());
		}
		
		// exibe a pilha
		System.out.println(pilha);


	}

}

package Pratica08Exercicio01;

import java.util.Stack;

public class Pratica08Exercicio01 {

	/* Método ehPalindromo - recebe um vetor de inteiros e devolve true
	 * se o vetor é palíndromo e false caso contrário
	 */
	public static boolean ehPalindromo(int[] v) {
		// Cria uma pilha para armazenar Integer
		Stack<Integer> pilha = new Stack<Integer>();
		
		// Empilha todos os elementos do vetor
		for (int i=0; i < v.length; i++) {
			pilha.push(v[i]);
		}
		
		/* Percorre o vetor no sentido normal, comparando cada elemento
		 * com o valor desempilhado da pilha. Se algum elemento do vetor
		 * for diferente ao desempilhado, retorna false (não é palíndromo)
		 */
		for (int i=0; i < v.length; i++) {
			if (v[i] != pilha.pop()) {
				return false;
			}
		}
		
		/* Se chegou aqui, é porque o vetor é palíndromo.
		 * Retorna true
		 */
		return true;
		
	}
	
	/* Método ehPalindromo2 - recebe um vetor de inteiros e devolve true
	 * se o vetor é palíndromo e false caso contrário
	 * Esse método é semelhante ao método anterior, mas percorre o vetor
	 * apenas uma vez
	 */
	public static boolean ehPalindromo2(int[] v) {
		Stack<Integer> pilha = new Stack<Integer>();
		int i;
		// Empilha metade do vetor
		for (i=0; i < v.length/2; i++) {
			pilha.push(v[i]);
		}
		// Se o tamanho do vetor é ímpar, avança o índice i
		if (v.length % 2 == 1) {
			i++;
		}
		// Percorre a 2a metade do vetor, comparando com os valores empilhados
		// Se algum valor do vetor for diferente ao desempilhado, retorna false
		for (; i < v.length; i++) {
			if (v[i] != pilha.pop()) {
				return false;
			}
		}
		// Vetor é palíndromo, então retorna true
		return true;
		
	}
	
	public static void main(String[] args) {
		int[] vetor1 = {1,3,3,1};
		int[] vetor2 = {10,20,30,40};
		int[] vetor3 = {10,20,30,30,20,10};
		int[] vetor4 = {1,2,3,2,1};
		
		if (ehPalindromo2(vetor1)) {
			System.out.println("vetor1 é palíndromo");
		}
		else {
			System.out.println("vetor1 não é palíndromo");
		}
		
		if (ehPalindromo2(vetor2)) {
			System.out.println("vetor2 é palíndromo");
		}
		else {
			System.out.println("vetor2 não é palíndromo");
		}
		if (ehPalindromo2(vetor3)) {
			System.out.println("vetor3 é palíndromo");
		}
		else {
			System.out.println("vetor3 não é palíndromo");
		}
		if (ehPalindromo2(vetor4)) {
			System.out.println("vetor4 é palíndromo");
		}
		else {
			System.out.println("vetor4 não é palíndromo");
		}

	}

}

package ExercicioVetor03;

import java.util.Scanner;

public class ExercicioVetor03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Cria o vetor para armazenar 10 inteiros
		int[] num = new int[10];
		
		// Declara uma variável soma para conter a soma dos valores
		double soma = 0;
		
		// Solicita que o usuário digite 10 valores inteiros
		// para preencher o vetor num
		for (int i=0; i < num.length; i++) {
			System.out.println("Digite um número inteiro");
			num[i] = leitor.nextInt();
			soma += num[i];
		}
		// Cálculo da média
		double media =  soma / num.length;
		System.out.println("A soma dos valores é " + soma);
		System.out.println("A média dos valores é " + media);
		
		// Exibir os valores do vetor que estão acima da media
		System.out.println("\nValores acima da média:");
		for (int i=0; i < num.length; i++) {
			if (num[i] > media) {
				System.out.println(num[i]);
			}
		}
		
		

	}

}

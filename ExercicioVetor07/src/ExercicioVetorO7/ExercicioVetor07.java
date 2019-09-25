package ExercicioVetorO7;

import java.util.Scanner;

public class ExercicioVetor07 {
	
	public static void preencheVetor(int[] v) {
		Scanner leitor = new Scanner(System.in);
		for (int i=0; i < v.length; i++) {
			System.out.println("Digite um valor inteiro");
			v[i] = leitor.nextInt();
		}
		
	}
	
	public static void exibeVetor(int[] v) {
		System.out.println("Valores do vetor");
		for (int i=0; i < v.length; i++) {
			System.out.print(v[i] + "\t");
		}
		System.out.println();
	}
	
	/* selectionSort - ordena selecionando o menor valor do vetor
	 * e posicionando o menor valor na posição correta
	 */
	public static void selectionSort(int[] v) {
		int indMenor, aux;
		
		for (int i=0; i < v.length-1; i++) {
			indMenor=i;
			for (int j= i+1; j < v.length; j++) {
				if (v[j] < v[indMenor]) {
					indMenor= j;
				}
			}
			// troca os valores de v[i] com v[indMenor]
			aux = v[i];
			v[i] = v[indMenor];
			v[indMenor]= aux;
			// Exibe vetor
			exibeVetor(v);
		}
	}

	public static void main(String[] args) {
		
		// Criação dos vetores
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		int[] vet3 = new int[10];

		System.out.println("Preenchendo e ordenando vet1");
		// Solicita que o usuário digite os valores do vet1
		preencheVetor(vet1);
		// Exibe os valores de vet1
		exibeVetor(vet1);
		// Ordena o vetor vet1
		selectionSort(vet1);

		System.out.println("Preenchendo e ordenando vet2");
		// Solicita que o usuário digite os valores do vet2
		preencheVetor(vet2);
		// Exibe os valores de vet2
		exibeVetor(vet2);
		// Ordena o vetor vet2
		selectionSort(vet2);

		// Percorre os vetores vet1 e vet2, copiando os valores
		// para o vetor vet3, de forma que vet3 fique ordenado
		int ind1=0, ind2=0, ind3=0;
		
		// enquanto os 2 vetores não foram totalmente percorridos
		while (ind1 < vet1.length && ind2 < vet2.length)
		{
			// Verifica se o menor valor está em vet1 ou em vet2
			if (vet1[ind1] <= vet2[ind2]) {
				vet3[ind3++] = vet1[ind1++]; // menor valor está em vet1
				                             // coloca esse valor em vet3
			}
			else {
				vet3[ind3++] = vet2[ind2++];  // menor valor está em vet2
				                              // coloca esse valor em vet3
			}
		}
		// Se foi o vet1 que não acabou, copia os valores
		// de vet1 para vet3
		while (ind1 < vet1.length) {
			vet3[ind3++] = vet1[ind1++];
		}
		// Se foi o vet2 que não acabou, copia os valores
		// de vet2 para vet3
		while (ind2 < vet2.length) {
			vet3[ind3++] = vet2[ind2++];
		}
		
		// Exibe o vet3
		System.out.println("\n\nExibindo vet3");
		exibeVetor(vet3);
	}

}

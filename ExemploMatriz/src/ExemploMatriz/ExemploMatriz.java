package ExemploMatriz;

import java.util.Scanner;

public class ExemploMatriz {
	
	// Método que recebe uma matriz de inteiros e exibe
	// os valores da matriz, no formato de matriz
	public static void exibeMatriz(int[][] m) {
		for (int linha=0; linha < m.length; linha++) {
			for (int coluna=0; coluna < m[linha].length; coluna++) {
				System.out.print(m[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}

	// Método que recebe uma matriz de inteiros e exibe
	// a matriz transposta, sendo que as linhas são exibidas
	// como colunas e as colunas são exibidas como linhas
	public static void exibeMatrizTransposta(int[][] m) {
		for (int coluna=0; coluna < m[0].length; coluna++) {
			for (int linha=0; linha < m.length; linha++) {
				System.out.print(m[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Cria uma matriz de inteiros com 3 linhas e 4 colunas
		int[][] matriz = new int[3][4];
		
		// Cria outra matriz, já inicializando os seus valores
		int[][] m1 = { {1,2}, {3,4}, {5,6}, {7,8} };
		
		// Cria outra matriz, já inicializando os seus valores
		// Esta matriz terá a quantidade de colunas diferente
		// em cada linha
		int[][] m2 = { {1,2}, {3,4,5}, {6,7,8,9}, {10} };

		// Solicita que o usuário digite os valores para 
		// preencher a matriz
		for (int linha=0; linha < matriz.length; linha++) {
			for (int coluna=0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Digite o valor de matriz["+
			                        linha+"]["+coluna+"]" );
				matriz[linha][coluna]= leitor.nextInt();
			}
		}
		
		// Exibe os valores da matriz
		System.out.println("Exibição da matriz:");
		exibeMatriz(matriz);

		// Exibe os valores da matriz m1
		System.out.println("\nExibição de m1:");
		exibeMatriz(m1);

		// Exibe os valores da matriz m2
		System.out.println("\nExibição de m2:");
		exibeMatriz(m2);
		
		// Exibe os valores da matriz transposta
		System.out.println("Exibição da matriz transposta:");
		exibeMatrizTransposta(matriz);
		
		// Exibe os valores da matriz m1 transposta
		System.out.println("\nExibição de m1 transposta:");
		exibeMatrizTransposta(m1);
		
	}

}

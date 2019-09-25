package ExercicioVetor06;

import java.util.Scanner;

public class ExercicioVetor06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Criação dos vetores para armazenar os modelos
		// e os consumos dos carros
		String[] modelo = new String[5];
		double[] consumo = new double[5];
		
		// Solicita que o usuário digite os modelos e os consumos
		// correspondentes para preencher os vetores
		for (int i=0; i < modelo.length; i++) {
			System.out.println("Digite o modelo do carro");
			modelo[i] = leitor.next();
			System.out.println("Digite o consumo desse carro");
			consumo[i] = leitor.nextDouble();
		}
		
		// Exibe os valores dos vetores
		System.out.println("\nModelos:");
		for (int i=0; i < modelo.length; i++) {
			System.out.print(modelo[i] + "\t");
		}

		System.out.println("\n\nConsumos:");
		for (int i=0; i < consumo.length; i++) {
			System.out.print(consumo[i] + "\t");
		}
		
		// Procura o indice do maior consumo
		
		// Declara uma variável chamada indMaior, que irá conter
		// o índice do maior consumo
		// Essa variável é inicializada com zero, pois no início,
		// assumimos que o maior valor está no índice zero
		int indMaior = 0;
		for (int i=1; i < consumo.length; i++ ) {
			if (consumo[i] > consumo[indMaior]) {
				indMaior = i;
			}
		}
		// Exibe o modelo mais econômico
		System.out.println("\n\nO modelo mais econômico é o " +
		                   modelo[indMaior] );
		leitor.close();
	
	}

}

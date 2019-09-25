package ExercicioVetor02;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Cria o vetor para 10 Strings
		String[] nome = new String[10];
		
		// Solicita que o usuário digite 10 nomes
		// para preencher o vetor nome]
		for(int i=0; i < nome.length; i++) {
			System.out.println("Digite um nome");
			nome[i] = leitor.nextLine();
		}
		
		// Solicita que o usuário digite um nome para ser
		// pesquisado no vetor de nomes
		System.out.println("Digite um nome para ser pesquisado");
		String nomeBusca = leitor.nextLine();
		
		// Verifica se nomeBusca existe no vetor nome
		// Se existir, exibe o índice onde o nomeBusca está
		// Senão, exibe "Nome não encontrado"
		boolean achou = false; // Variável achou indica se achou ou não
		for (int i=0; i < nome.length && !achou; i++) {
			if (nome[i].equals(nomeBusca)) {
				System.out.println("Encontrou o nome no índice "
						           + i);
				achou = true;
			}
		}
		
		// Se não encontrou, exibe a mensagem "Nome não encontrado"
		if (!achou) {
			System.out.println("Nome não encontrado");
		}
		
		leitor.close();

	}

}

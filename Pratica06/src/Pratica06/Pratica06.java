package Pratica06;

import java.util.Scanner;

public class Pratica06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Declaração das variáveis
		int maxAluno;			// quantidade máxima de alunos
		String[] aluno;			// vetor de nomes de alunos
		double[][] notas;		// matriz de notas dos alunos
		double[] media = new double[2];		// vetor de média das notas
		
		// Leitura e validação de maxAluno
		do {
			System.out.println("Digite a quantidade de alunos "+
							   "(valor entre 5 e 15)");
			maxAluno= leitor.nextInt();
		} while (maxAluno < 5 || maxAluno > 15);
		
		// Cria o vetor aluno e a matriz notas
		aluno = new String[maxAluno];
		notas = new double[maxAluno][2];
		
		// Solicita que o usuário digite o nome dos alunos
		// e armazena os nomes lidos no vetor aluno
		for (int i=0; i < aluno.length; i++) {
			System.out.println("Digite o nome de um aluno");
			aluno[i] = leitor.next();
		}
		
		// Solicita que o usuário digite as notas dos alunos
		// e armazena as notas lidas na matriz notas
		for (int linha=0; linha < notas.length; linha++) {
			for (int coluna=0; coluna < notas[0].length; coluna++) {
				System.out.println("Digite a nota AC" + (coluna+1)+
						           " do aluno " + aluno[linha]);
				notas[linha][coluna]= leitor.nextDouble();
			}
		}
		
		// Cálculo das médias das notas AC1 e das notas AC2
		// Essas médias serão armazenadas no vetor media
		for (int coluna=0; coluna < notas[0].length; coluna++) {
			double soma = 0;
			for (int linha=0; linha < notas.length; linha++) {
				soma += notas[linha][coluna];
			}
			media[coluna]= soma / maxAluno;
		}
		
		// Exibição do vetor aluno, da matriz notas e do vetor media
		System.out.printf("%-15s%10s%10s\n", "NOME DO ALUNO",
				          "NOTA AC1", "NOTA AC2");
		for (int linha=0; linha < notas.length; linha++) {
			System.out.printf("%-15s",aluno[linha]);
			for (int coluna=0; coluna < notas[0].length; coluna++) {
				System.out.printf("%10.2f",notas[linha][coluna]);
			}
			System.out.println();
		}
		// Exibição das médias
		System.out.printf("%-15s", "MÉDIA:");
		for (int i=0; i < media.length; i++) {
			System.out.printf("%10.2f",media[i]);
		}
	}

}

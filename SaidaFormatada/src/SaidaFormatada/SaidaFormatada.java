package SaidaFormatada;

public class SaidaFormatada {
	
	public static void main(String[] args) {
		String nome1 = "Maria";
		String nome2 = "Fulano";
		double nota1 = 8;
		double nota2 = 7.5;
		
		/* Exemplo de uso de printf para exibir Strings */
		/* O printf não muda para a linha seguinte automaticamente,
		 * é preciso por o \n para que ele já mude para a linha
		 * seguinte
		 */
		System.out.printf("Boa noite!\n");
		System.out.printf("Tudo bem?\n");
		
		System.out.printf("--------------------------\n");
		/* O comando a seguir exibe os títulos das colunas
		 * de maneira que "NOME" seja exibido em um campo de
		 * 10 caracteres, alinhado à esquerda e "NOTA" seja
		 * exibido em um campo de 5 caracteres, alinhado à
		 * direita.
		 */
		System.out.printf("%-10s%5s\n", "NOME", "NOTA");
		
		/* Exibe o valor de nome1 num campo de 10 caracteres,
		 * alinhado à esquerda e o valor de nota1 num campo de
		 * 5 caracteres, com 2 casas após a vírgula, alinhado
		 * à direita.
		 */
		System.out.printf("%-10s%5.2f\n", nome1, nota1);
		
		/* Faz o mesmo com nome2 e nota2 */
		System.out.printf("%-10s%5.2f\n", nome2, nota2);
		
		/* Exemplo de uso de String.format, que é usado para produzir
		 * uma String formatada. A maneira de passar os argumentos 
		 * para o format é igual ao do printf
		 */
		String saida = 
			String.format("O nome é %s e a nota é %.2f",
					      nome1, nota1);
		System.out.println(saida);
		
	}

}

package ExemploFila;

import java.util.concurrent.ArrayBlockingQueue;

public class ExemploFila {

	public static void main(String[] args) {
		
		/* Cria objeto fila da classe ArrayBlockingQueue para armazenar String
		 * com capacidade = 5
		 */
		ArrayBlockingQueue<String> fila = new ArrayBlockingQueue<String>(5);
		
		/* Insere elementos na fila */
		/* Se a fila estiver cheia, gera uma Exception */
		try {
			fila.add("Mickey");
			fila.add("Pateta");
			fila.add("Pluto");
			fila.add("Donald");
			fila.add("Cebolinha");
			fila.add("Monica");
		}
		catch(IllegalStateException erro) {   /* trata a exceção de fila cheia */
			System.out.println("Fila cheia");
		}
		
		/* Exibe a fila */
		System.out.println("Fila: "+ fila);
		
		/* Exibe quem é o primeiro da fila, sem remover */
		System.out.println("Quem é o primeiro? "+ fila.peek());

		/* Exibe a fila */
		System.out.println("Fila: "+ fila);
		
		/* Remove e exibe um elemento da fila */
		System.out.println("Removendo: "+ fila.poll());

		/* Exibe a fila */
		System.out.println("Fila: "+ fila);
		
		/* Esvazia a fila, exibindo os elementos removidos */
		while (fila.size() > 0) {     /* Enquanto o tamanho da fila é maior do que zero */
			/* Remove e exibe um elemento da fila */
			System.out.println("Removendo: "+fila.poll());
		}
		
		/* Exibe a fila */
		System.out.println("Fila: "+ fila);

	}

}

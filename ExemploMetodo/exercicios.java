package exemplometodo;

public class exercicios {
	public static void classificaIdade(int idade) {
		if (idade >= 0 || idade <= 2) {
			System.out.println("Bebê");
		}
		if (idade >= 3 || idade <= 11) {
			System.out.println("Criança");
		}
		if (idade >= 12 || idade <= 19) {
			System.out.println("Adolescente");
		}
		if (idade >= 20 || idade <= 30) {
			System.out.println("Jovem");
		}
		if (idade >= 31 || idade <= 60) {
			System.out.println("Adulto");
		}
		else if (idade >= 61) {
			System.out.println("Idoso");
		}
	}
}

package LeticiaAtividade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Baralho baralho = new Baralho();
        int totalOuro = 0;
        int totalCopas = 0;

        System.out.println(baralho.toString());

        baralho.embaralhar();
        System.out.println("Embalharado");
        System.out.println(baralho.toString());

        baralho.embaralhar();
        System.out.println("Embalharado novamente");
        System.out.println(baralho.toString());

        System.out.println("Digite a quantidade de cartas a serem viradas: ");
        int qtd = leitor.nextInt();

        while (qtd < 5 || qtd > 8 ) {
            System.out.println("Digite um numero entre 5 e 8");
            qtd = leitor.nextInt();
        }

        System.out.println();

        System.out.println("Cartas viradas: ");
        for (int i = 0; i < qtd; i++) {
            Carta valor;
            String naipe;
            valor = baralho.virarCarta();

            System.out.print(valor.toString());
            naipe = valor.getNaipe();

            if (naipe == "Ouros") {
                totalOuro += 1;
            }
            if (naipe == "Copas") {
                totalCopas += 1;
            }
        }
        System.out.println("Total de Ouros: " + totalOuro);
        System.out.println("Total de Copas: " + totalCopas);

        if (totalOuro == qtd || totalCopas == qtd) {
            System.out.println( "Você é o vencedor!");
        } else {
            System.out.println("Você é o perdedor, poxavida");
        }
    }
}

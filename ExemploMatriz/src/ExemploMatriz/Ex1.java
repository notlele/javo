package ExemploMatriz;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //matriz 2x3
        int[][] matriz = new int[2][3];

        //pede
        for (int l=0; l < matriz.length; l++) {
            for (int c=0; c < matriz[l].length; c++) {
                System.out.println("Digite o valor da matriz["+l+"]["+c+"]" );
                matriz[l][c]= leitor.nextInt();
            }
        }

        //exibe
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }

    }
}
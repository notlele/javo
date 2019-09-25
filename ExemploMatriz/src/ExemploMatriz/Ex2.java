package ExemploMatriz;

import java.util.Scanner;

public class Ex2 {

    public static void exibeMatriz(int[][] m){
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.print(m[l][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //matriz 2x3
        int[][] matriz = new int[2][3];

        //pede 2x
        for (int i=0;i<2;i++) {
            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[l].length; c++) {
                    System.out.println("Digite o valor da matriz[" + l + "][" + c + "]");
                    matriz[l][c] = leitor.nextInt();
                }
            }
        }
        //exibe
        System.out.println("Exibição das matrizes:");
        exibeMatriz(matriz);
    }
}

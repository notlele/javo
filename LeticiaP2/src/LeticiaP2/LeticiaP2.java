package LeticiaP2;

import java.util.Scanner;

public class LeticiaP2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxAlun;
        double soma;

        do {
            System.out.println("Digite a quantidade de alunos");
            maxAlun = leitor.nextInt();
        } while (maxAlun < 6 || maxAlun > 20);

        int[] ra = new int[maxAlun];
        double[] media = new double[maxAlun];
        double[][] notas = new double[maxAlun][2];

        for(int i=0; i < ra.length; i++) {
            System.out.println("Digite o RA do aluno " + (i+1));
            ra[i] = leitor.nextInt();
        }

        double nota1;
        double nota2;
        for (int l=0; l < notas.length; l++) {
            nota1 = 0;
            nota2 = 0;
            for (int c=0; c < notas[0].length; c++) {
                if (c==0) {
                    System.out.println("Digite a nota da continuada do aluno " + ra[l]);
                    notas[l][c]= leitor.nextDouble();
                    nota1 += notas[l][c] * 0.4;
                }
                else {
                    System.out.println("Digite a nota da integrada do aluno " + ra[l]);
                    notas[l][c] = leitor.nextDouble();
                    nota2 += notas[l][c] * 0.6;
                }
            }
            media[l] = nota1+nota2;
        }

        System.out.printf("%-15s%-15s%-15s%10s\n", "RA",
                "Av. Continuada", "Av. Integrada", "Media");
        for (int l=0; l < notas.length; l++) {
            System.out.printf("%-15s",ra[l]);
            for (int c=0; c < notas[0].length; c++) {
                System.out.printf("%-15s",notas[l][c]);
            }
            System.out.printf("%10s",media[l]);
            System.out.println();
        }



    }
}

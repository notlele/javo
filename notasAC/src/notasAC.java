import java.util.Scanner;

public class notasAC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxAluno;

        do {
            System.out.println("insira um numero entre 5 e 15");
            maxAluno = leitor.nextInt();
        } while (maxAluno < 5 || maxAluno > 15);


        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] media = new double[2];


        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome do aluno [" + i + "]:");
            aluno[i] = leitor.next();
        }

        for (int l=0; l < notas.length; l++) {
            for (int c=0; c < notas[l].length; c++) {
                System.out.println("Digite a nota da AC1 e AC2 do aluno " + aluno[l] + "" );
                notas[l][c]= leitor.nextDouble();
            }
        }

        double soma1 = 0.0;
        double soma2 = 0.0;

        for (int i = 0; i < notas.length; i++) {
            soma1 += notas[i][0];
        }

        for (int i = 0; i < notas.length; i++) {
            soma2 += notas[i][1];
        }

        media[0] = (soma1 / notas.length);
        media[1] = (soma2 / notas.length);

        System.out.println("Nome do Aluno \tNota AC1 \tNota AC2\n" );
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\n%s \t %10s\t %10s ", aluno[i], notas[i][0], notas[i][1]);
        }
        System.out.printf("\nMedia da classe:\t %.2f \t %.2f", media[0] , media[1]);
    }
}

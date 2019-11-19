import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class SequenciaNro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = {2,7,-3,-50,45,-4,30,-21,38};

        ArrayBlockingQueue<Integer> filaPos = new ArrayBlockingQueue<>(6);
        ArrayBlockingQueue<Integer> filaNeg = new ArrayBlockingQueue<>(6);

        for (int i=0; i < vetor.length; i++) {
            if(vetor[i] >= 0) {
                filaPos.add(vetor[i]);
            }
            else {
                filaNeg.add(vetor[i]);
            }
        }


        for (int i=0; i < vetor.length; i++) {
            if (filaPos.peek() != null) {
                System.out.print(filaPos.poll() + " ");
            }
        }
        for (int i=0; i < vetor.length; i++) {
            if (filaNeg.peek() != null) {
                System.out.print(filaNeg.poll() + " ");
            }
        }


    }
}

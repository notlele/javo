package LeticiaAC3;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class LeticiaAC3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int v[] = new int[10];
        ArrayBlockingQueue<Integer> fila = new ArrayBlockingQueue<>(10);
        Stack <Integer> pilha = new Stack<>();

        for (int i=0; i < v.length; i++) {
            System.out.println("Digite um valor inteiro");
            v[i] = leitor.nextInt();
            if (v[i] < 0) {
                pilha.push(v[i]);
            }
            else {
                fila.add(v[i]);
            }
        }

        do {
            System.out.printf(fila.poll() + " ");
        } while (fila.size() > 0);

        do {
            System.out.printf(pilha.pop() + " ");
        } while (pilha.size() > 0);
    }
}

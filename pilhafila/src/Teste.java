import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int choice;
        int nro;
        double valor;
        int operacoes = 0;
        int qtd;
        String tipo;
        ContaBancaria objConta = null;
        ArrayBlockingQueue<Operacao> operacoesList = new ArrayBlockingQueue<>(100);

        do {
            System.out.println("1. Debitar");
            System.out.println("2. Depositar");
            System.out.println("3. Desfazer operação");
            System.out.println("4. Sair");
            choice = leitor.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Digite o numero da conta:");
                    nro = leitor.nextInt();
                    System.out.println("Digite o valor a ser debitado:");
                    valor = leitor.nextDouble();
                    objConta.setNumero(nro);
                    objConta.getSaldo();
                    Operacao operacao = new Operacao(objConta,"debito",valor);
                    operacoesList.add(operacao);
                    operacoes += 1;
                    break;
                case 2:
                    System.out.println("Digite o numero da conta:");
                    nro = leitor.nextInt();
                    System.out.println("Digite o valor a ser depositado:");
                    valor = leitor.nextDouble();
                    operacoes += 1;
                    break;
                case 3:
                    System.out.println("Digite a quantidade de operações a serem desfeitas:");
                    qtd = leitor.nextInt();
                    if (qtd > operacoes) {
                        System.out.println("Quantidade maior que o numero de operações realizadas");
                    } else {
                        for (int i=0; i < operacoes.size(); i++) {
                            operacoes.poll();
                            qtd -= 1;
                        }
                    }
                    break;
                case 4:
                    if (lista.size() == 0)  {
                        System.out.println("Lista está vazia. Não há nada a gravar");
                    }
                    else {
                        gravaLista(lista);
                        lista.clear();
                    }

                    break;
                case 5:
                    exibeArquivo();
                    break;
                case 6:
                    System.out.printf("Fim da execução");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (choice != 6);
    }
}

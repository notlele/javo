package Livro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Teste {
    public static void gravaLista(ArrayList<Livro> lista) {
        FileWriter arq = null;
        Formatter saida = null;
        boolean parou = false;

        try {
            arq = new FileWriter("livros.txt", true);
            saida = new Formatter(arq);
        }
		catch (IOException erro) {
        System.err.println("Não foi possível abrir o arquivo");
        System.exit(1);
        }
        try {
            for (Livro l : lista) {
                saida.format("%d %s %s %.2f%n",l.getIdLivro(),l.getTitulo(),l.getAutor(),l.getPreco());
            }
        }
        catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar o arquivo");
            parou = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar o arquivo");
                parou = true;
            }
            if (parou) {
                System.exit(1);
            }
        }
    }

    public static void exibeArquivo() {
        FileReader arq = null;
        Scanner entrada = null;
        boolean parou = false;

        try {
            arq = new FileReader("livros.txt");
            entrada = new Scanner(arq);
        }
		catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }
        try {
            System.out.printf("%-8s%-10s%-10s%7s\n", "idLivro", "Titulo","Autor", "Preço");
            while (entrada.hasNext()) {
                int idLivro = entrada.nextInt();
                String titulo = entrada.next();
                String autor = entrada.next();
                double preco = entrada.nextDouble();
                System.out.printf("%-8d%-10s%-10s%7.2f\n", idLivro,titulo,autor,preco);
            }
        }
        catch (NoSuchElementException erro) {
            System.err.println("Arquivo está com problema");
            parou = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo");
                parou = true;
            }
            if (parou) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int choice;
        int idLivro;
        String titulo;
        String autor;
        double preco;
        ArrayList<Livro> lista = new ArrayList<Livro>();

        do {
            System.out.println("1. Adicionar um livro");
            System.out.println("2. Exibir a lista");
            System.out.println("3. Exibir apenas os livros de um determinado autor");
            System.out.println("4. Gravar a lista em um arquivo");
            System.out.println("5. Ler e exibir arquivo");
            System.out.println("6. Fim");
            choice = leitor.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Digite o ID do livro:");
                    idLivro = leitor.nextInt();
                    System.out.println("Digite o nome do livro:");
                    titulo = leitor.next();
                    System.out.println("Digite o autor:");
                    autor = leitor.next();
                    System.out.println("Digite o valor do livro:");
                    preco = leitor.nextDouble();
                    Livro livro = new Livro(idLivro,titulo,autor,preco);
                    lista.add(livro);
                    break;
                case 2:
                    if (lista.size() == 0)  {
                        System.out.println("Lista está vazia");
                    }
                    else {
                        for (Livro l : lista) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 3:
                    if (lista.size() == 0)  {
                        System.out.println("Lista está vazia");
                    }
                    else {
                        System.out.println("Digite o autor:");
                        autor = leitor.next();
                        for (Livro l : lista) {
                            if (l.getAutor() == autor) {
                                System.out.println(l);
                            }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeimovel;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TesteImovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Imovel apto = new Imovel();
        System.out.println("Insira, em ordem, endereço, área e preço/m² do imóvel");
        apto.endereco = leitor.nextLine();
        do {
            apto.area = leitor.nextInt();
        } while (apto.area < 0);
        do {
            apto.precoM2 = leitor.nextInt();
        } while (apto.precoM2 < 0);
        System.out.println("Imóvel no endereço " + apto.endereco + ", com " + apto.area + "m² e com valor de R$" + apto.precoM2 + " por m²");
        double precoApto = apto.calculaPreco(apto.area, apto.precoM2);
        System.out.println("Valor do imóvel: R$" + precoApto);
        
        
        Imovel casa = new Imovel();
        System.out.println("Insira, em ordem, endereço, área e preço/m² do imóvel");
        casa.endereco = leitor.nextLine();
        do {
            casa.area = leitor.nextInt();
        } while (casa.area < 0);
        do {
            casa.precoM2 = leitor.nextInt();
        } while (casa.precoM2 < 0);
        System.out.println("Imóvel no endereço " + casa.endereco + ", com " + casa.area + "m² e com valor de R$" + casa.precoM2 + " por m²");
        double precoCasa = casa.calculaPreco(casa.area, casa.precoM2);
        System.out.println("Valor do imóvel: R$" + precoCasa);        
    }
}

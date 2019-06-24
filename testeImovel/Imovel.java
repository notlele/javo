/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeimovel;

/**
 *
 * @author Aluno
 */
public class Imovel {
    String endereco;
    int area;
    int precoM2;
    
    public double calculaPreco(double area, double precoM2) {
        return area * precoM2;
    }
}

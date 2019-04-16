/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearea;

/**
 *
 * @author Aluno
 */
public class TesteArea {

    public static int area (int q) {
        return q * q;
    }
    
    public static int area (int base, int altura) {
        return 2*(base + altura);
    }
    public static void main(String[] args) {
        int quadrado = area(2);
        int retangulo = area(4,2);
        
        System.out.println("Area do quadrado = " + quadrado + "cm²");
        System.out.println("Area do retangulo = " + retangulo + "cm²");
    }
    
}

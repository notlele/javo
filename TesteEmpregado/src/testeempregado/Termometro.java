/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeempregado;

/**
 *
 * @author Aluno
 */
public class Termometro {
    int temperaturaAtual;
    int temperaturaMax;
    int temperaturaMin;
    
    public void aumentaTemperatura(int max) {
        if (max > temperaturaMax) {
            temperaturaMax = max;
        }
    }
    
    public void diminuiTemperatura(int min) {
        if (min > temperaturaMin) {
            temperaturaMin = min;
        }
    }
    
    public void exibeFahrenheit() {
        double fahrenheit = temperaturaAtual * 1.8 + 32;
        System.out.println("Current weather: " + fahrenheit + "ºF");
    }
}

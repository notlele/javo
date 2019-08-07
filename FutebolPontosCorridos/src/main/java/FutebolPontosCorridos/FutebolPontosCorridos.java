/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FutebolPontosCorridos;

/**
 *
 * @author Aluno
 */
public class FutebolPontosCorridos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeFutebol timo = new TimeFutebol("timo");
        timo.registrarVitoria();
        timo.registrarVitoria();
        timo.registrarEmpate();
        System.out.println(timo.toString());
        timo.registrarDerrota();
        timo.registrarVitoria();
        System.out.println(timo.toString());
    }
    
}

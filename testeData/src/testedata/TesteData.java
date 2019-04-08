/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedata;

/**
 *
 * @author Aluno
 */
public class TesteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Data dezembro = new Data();
        dezembro.iniciaData(25,12,2018);
        dezembro.exibeData();
        
        
        dezembro.comparaData(25, 12, 2018);
    }
    
}

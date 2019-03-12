/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodo;

/**
 *
 * @author Aluno
 */
public class TesteAluno {
    public static void main(String[] args) {
        Aluno claudia = new Aluno();
        
        // atribuindo valores ao obj
        claudia.nome = "Claudia";
        claudia.ra = 52094;
        claudia.nota = 10;
        claudia.qtdFalta = 0;
        claudia.aprovado = true;
        
        // chamando os metodos do obj
        claudia.verNota();
        claudia.verFalta();
        
        // mostrando os valores dos atributos
        System.out.println("O aluno " + claudia.nome + " de RA " + claudia.ra + " tem nota " + claudia.nota + " e " + claudia.qtdFalta + " falta(s).");
        
        if (claudia.nota > 5.0) {
            System.out.println(claudia.nome + " está acima da média");
        }
        
        // outro obj aluno
        Aluno frank = new Aluno();
        
        // atribuindo valores ao obj
        frank.nome = "Frank";
        frank.ra = 52008;
        frank.nota = 7;
        frank.qtdFalta = 2;
        frank.aprovado = false;
        
        // chamando os metodos do obj
        frank.verNota();
        frank.verFalta();
        
        // mostrando os valores dos atributos
        System.out.println("O aluno " + frank.nome + " de RA " + frank.ra + " tem nota " + frank.nota + " e " + frank.qtdFalta + " falta(s).");
        
        if (frank.nota > 5.0) {
            System.out.println(frank.nome + " está acima da média");
        }
    }
    
    // exercicios carro, override
    @Override
    public String toString() {
        return "Modelo: " + modelo + " \nCor: " + cor + "\nAno: " + ano + "\nVelocidade Atual: " + velocidadeAtual + "\nVelocidade Maxima " + velocidadeMaxima + "\nLigado? " + ligado;
    }

}
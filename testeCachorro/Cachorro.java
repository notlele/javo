/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecachorro;

/**
 *
 * @author Aluno
 */
class Cachorro {
    
    private String apelido;
    private float peso;
    
    public Cachorro() {
    }
    
    public Cachorro(String apelido, float peso) {
    }
    
    void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    String getApelido() {
        return apelido;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    float getPeso() {
        return peso;
    }
    
    
    void comer(String comida, float qtd) {
        if (qtd <= 0) {
            System.out.println("Alimentação inválida!");
        }
        else if (peso >= 30) {
            System.out.println("Cão obeso demais, não vai aceitar a comida");
        }
        else {
            peso += (qtd/30*100);
            System.out.println("Cão comeu " + qtd + "kg de " + comida);
        }
    }
}

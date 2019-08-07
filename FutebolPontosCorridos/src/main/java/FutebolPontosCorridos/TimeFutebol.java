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
public class TimeFutebol {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    
    TimeFutebol(String nome) {
        setNome(nome);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    
    public void registrarVitoria() {
        vitorias+=1;
    }
    
    public void registrarEmpate() {
        empates+=1;
    }
    
    public void registrarDerrota() {
        derrotas+=1;
    }
    
    public boolean isInvicto() {
        return derrotas == 0;
    }
    
    public int getPontuacao() {
        return (vitorias*3) + empates;
    }
    
    public String toString() {
        return "Nome - "+this.nome+",vitorias - "+this.vitorias+",derrotas - "+this.derrotas+",empates - "+this.empates+",pontuação - "+getPontuacao()+",é invicto? - "+isInvicto();
    }
    
}

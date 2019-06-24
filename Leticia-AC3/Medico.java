/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leticia.ac3;

/**
 *
 * @author Aluno
 */
public class Medico {
    
    private int crm;
    private String nome;
    private int qtdConsulta;
    private double valorConsulta;
    
    public Medico() {
    }
    
    public Medico(int crm, String nome, int qtdConsulta, double valorConsulta){
        this.crm = crm;
        this.nome = nome;
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }
    
    public double calculaGanho() {
        return (getValorConsulta() * getQtdConsulta());
    }
    
    
 @Override
    public String toString() {
        return "Medico{" + "crm=" + getCrm() + ", nome=" + getNome() +
                ", qtdConsulta=" + getQtdConsulta() + ", valorConsulta=" + getValorConsulta() +
                ", ganho= " + calculaGanho() + '}';
    }

    /**
     * @return the crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtdConsulta
     */
    public int getQtdConsulta() {
        return qtdConsulta;
    }

    /**
     * @param qtdConsulta the qtdConsulta to set
     */
    public void setQtdConsulta(int qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    /**
     * @return the valorConsulta
     */
    public double getValorConsulta() {
        return valorConsulta;
    }

    /**
     * @param valorConsulta the valorConsulta to set
     */
    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

}

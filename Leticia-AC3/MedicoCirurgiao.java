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
public class MedicoCirurgiao extends Medico {
    private int qtdCirurgia;
    private double valorCirurgia;
    
    public MedicoCirurgiao(int crm, String nome, int qtdConsulta, double valorConsulta, int qtdCirurgia, double valorCirurgia) {
        super(crm, nome, qtdConsulta, valorConsulta);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
    }
    
    
    @Override
    public double calculaGanho() {
        return ((super.getQtdConsulta() * super.getValorConsulta()) + (getValorCirurgia()*getQtdCirurgia()));
    }
    
    
    
    @Override
       public String toString() {
           return "Medico{" + "crm=" + getCrm() + ", nome=" + getNome() +
                   ", qtdConsulta=" + getQtdConsulta() + ", valorConsulta=" + getValorConsulta() + ", qtdCirurgia=" 
                   + getQtdCirurgia() + ", valorCirurgia=" + getValorCirurgia() +
                   ", ganho= " + calculaGanho() + '}';
       }

    /**
     * @return the qtdCirurgia
     */
    public int getQtdCirurgia() {
        return qtdCirurgia;
    }

    /**
     * @param qtdCirurgia the qtdCirurgia to set
     */
    public void setQtdCirurgia(int qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    /**
     * @return the valorCirurgia
     */
    public double getValorCirurgia() {
        return valorCirurgia;
    }

    /**
     * @param valorCirurgia the valorCirurgia to set
     */
    public void setValorCirurgia(double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

}

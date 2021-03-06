package sf.modelo;
// Generated 13/09/2016 11:20:51 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Parcela generated by hbm2java
 */
public class Parcela  implements java.io.Serializable {


     private Integer parCod;
     private Despesa despesa;
     private Receita receita;
     private Boolean parParcelaPaga;
     private Date parData;
     private double parValor;

    public Parcela() {
    }

	
    public Parcela(double parValor) {
        this.parValor = parValor;
    }
    public Parcela(Despesa despesa, Receita receita, Boolean parParcelaPaga, Date parData, double parValor) {
       this.despesa = despesa;
       this.receita = receita;
       this.parParcelaPaga = parParcelaPaga;
       this.parData = parData;
       this.parValor = parValor;
    }
   
    public Integer getParCod() {
        return this.parCod;
    }
    
    public void setParCod(Integer parCod) {
        this.parCod = parCod;
    }
    public Despesa getDespesa() {
        return this.despesa;
    }
    
    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }
    public Receita getReceita() {
        return this.receita;
    }
    
    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    public Boolean getParParcelaPaga() {
        return this.parParcelaPaga;
    }
    
    public void setParParcelaPaga(Boolean parParcelaPaga) {
        this.parParcelaPaga = parParcelaPaga;
    }
    public Date getParData() {
        return this.parData;
    }
    
    public void setParData(Date parData) {
        this.parData = parData;
    }
    public double getParValor() {
        return this.parValor;
    }
    
    public void setParValor(double parValor) {
        this.parValor = parValor;
    }




}



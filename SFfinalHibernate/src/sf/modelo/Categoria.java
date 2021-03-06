package sf.modelo;
// Generated 13/09/2016 11:20:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer catCod;
     private String catNome;
     private String catDesc;
     private Set despesas = new HashSet(0);
     private Set receitas = new HashSet(0);

    public Categoria() {
    }

    public Categoria(String catNome, String catDesc, Set despesas, Set receitas) {
       this.catNome = catNome;
       this.catDesc = catDesc;
       this.despesas = despesas;
       this.receitas = receitas;
    }
   
    public Integer getCatCod() {
        return this.catCod;
    }
    
    public void setCatCod(Integer catCod) {
        this.catCod = catCod;
    }
    public String getCatNome() {
        return this.catNome;
    }
    
    public void setCatNome(String catNome) {
        this.catNome = catNome;
    }
    public String getCatDesc() {
        return this.catDesc;
    }
    
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }
    public Set getDespesas() {
        return this.despesas;
    }
    
    public void setDespesas(Set despesas) {
        this.despesas = despesas;
    }
    public Set getReceitas() {
        return this.receitas;
    }
    
    public void setReceitas(Set receitas) {
        this.receitas = receitas;
    }




}



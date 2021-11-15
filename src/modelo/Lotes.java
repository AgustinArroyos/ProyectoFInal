/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lotes implements Serializable {
    @Id
    long numeroDeLote;
    @Basic
    int entero;
   
    @ManyToOne
    Tipo_suelo tiposuelo;
    @OneToMany(mappedBy = "lote")
    private List<Campo> campos;

    public Lotes() {
    }

    public Lotes(long numeroDeLote, int entero, Tipo_suelo tiposuelo) {
        this.numeroDeLote = numeroDeLote;
        this.entero = entero;
        this.tiposuelo = tiposuelo;
    }

    public long getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(long numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Tipo_suelo getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(Tipo_suelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }
  
    
}

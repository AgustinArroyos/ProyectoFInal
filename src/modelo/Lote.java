/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.persistence.Entity;


public class Lote {
    long numeroDeLote;
    int entero;
    Tipo_suelo tiposuelo;

    public Lote(long numeroDeLote, int entero, Tipo_suelo tiposuelo) {
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

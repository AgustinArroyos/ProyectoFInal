/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sring
 */
public class Lote {
    long numeroDeLote;
    int entero;
    Tipo_suelo tiposuelo;
    ArrayList<Campo> campos;

    public Lote(long numeroDeLote, int entero, Tipo_suelo tiposuelo, ArrayList<Campo> campos) {
        this.numeroDeLote = numeroDeLote;
        this.entero = entero;
        this.tiposuelo = tiposuelo;
        this.campos = campos;
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

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }
    
    
    
    
}

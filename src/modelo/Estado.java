/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Estado implements Serializable {
    @Id    
    long codEstado;
    @Basic 
    String nombreEstado;

    public Estado() {
    }

    public Estado(long codEstado, String nombreEstado) {
        this.codEstado = codEstado;
        this.nombreEstado = nombreEstado;
    }

    public long getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(long codEstado) {
        this.codEstado = codEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
    
    
}

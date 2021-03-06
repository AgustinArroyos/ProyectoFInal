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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Campo implements Serializable {
   
    @Id
    long codCampo;
    
    @Basic
    String nombre_campo;
    @Basic
    String ubicacionCampo;
    
    
    @OneToOne
    Estado estado;
    
   
    @OneToOne
    Lotes lote;

    public Campo() {
    }

    
    public Campo(long codCampo, String nombre_campo, String ubicacionCampo, Estado estado, Lotes lote) {
        this.codCampo = codCampo;
        this.nombre_campo = nombre_campo;
        this.ubicacionCampo = ubicacionCampo;
        this.estado = estado;
        this.lote = lote;
    }

    public String getNombre_campo() {
        return nombre_campo;
    }

    public void setNombre_campo(String nombre_campo) {
        this.nombre_campo = nombre_campo;
    }

    
    public long getCodCampo() {
        return codCampo;
    }

    public void setCodCampo(long codCampo) {
        this.codCampo = codCampo;
    }

    public String getUbicacionCampo() {
        return ubicacionCampo;
    }

    public void setUbicacionCampo(String ubicacionCampo) {
        this.ubicacionCampo = ubicacionCampo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Lotes getLote() {
        return lote;
    }

    public void setLote(Lotes lote) {
        this.lote = lote;
    }
    
    
    
}

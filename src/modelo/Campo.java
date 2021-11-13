/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sring
 */
public class Campo {
    long codCampo;
    String nombre_campo;
    String ubicacionCampo;
    Estado estado;
    Lote lote;

    public Campo(long codCampo, String nombre_campo, String ubicacionCampo, Estado estado, Lote lote) {
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

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
    
    
    
}

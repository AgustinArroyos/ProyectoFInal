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
public class Cultivo {
    long codCultivo;
    String nombreCUltivo;
    Orden orden;
    Tipo_suelo tiposuelo;

    public Cultivo(long codCultivo, String nombreCUltivo, Orden orden, Tipo_suelo tiposuelo) {
        this.codCultivo = codCultivo;
        this.nombreCUltivo = nombreCUltivo;
        this.orden = orden;
        this.tiposuelo = tiposuelo;
    }

    public long getCodCultivo() {
        return codCultivo;
    }

    public void setCodCultivo(long codCultivo) {
        this.codCultivo = codCultivo;
    }

    public String getNombreCUltivo() {
        return nombreCUltivo;
    }

    public void setNombreCUltivo(String nombreCUltivo) {
        this.nombreCUltivo = nombreCUltivo;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Tipo_suelo getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(Tipo_suelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }



    
    
}

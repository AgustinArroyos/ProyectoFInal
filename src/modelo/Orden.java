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
public class Orden {
    int codOrden;
    String etapa;
    Laboreo laboreo;
    Cultivo cultivo;

    public Orden(int codOrden, String etapa, Laboreo laboreo, Cultivo cultivo) {
        this.codOrden = codOrden;
        this.etapa = etapa;
        this.laboreo = laboreo;
        this.cultivo = cultivo;
    }

    public int getCodOrden() {
        return codOrden;
    }

    public void setCodOrden(int codOrden) {
        this.codOrden = codOrden;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public Laboreo getLaboreo() {
        return laboreo;
    }

    public void setLaboreo(Laboreo laboreo) {
        this.laboreo = laboreo;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }
    
    
    
    
}

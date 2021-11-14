/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;

@Entity


public class Cultivo {
    long codCultivo;
    String nombreCUltivo;

    public Cultivo() {
    }

    
    public Cultivo(long codCultivo, String nombreCUltivo) {
        this.codCultivo = codCultivo;
        this.nombreCUltivo = nombreCUltivo;
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
    

   

    
    
}

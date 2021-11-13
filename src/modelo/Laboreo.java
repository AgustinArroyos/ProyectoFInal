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
public class Laboreo {
    
    long codLaboreo;
    String NombreLaboreo;

    public Laboreo(long codLaboreo, String NombreLaboreo) {
        this.codLaboreo = codLaboreo;
        this.NombreLaboreo = NombreLaboreo;
    }

    public long getCodLaboreo() {
        return codLaboreo;
    }

    public void setCodLaboreo(long codLaboreo) {
        this.codLaboreo = codLaboreo;
    }

    public String getNombreLaboreo() {
        return NombreLaboreo;
    }

    public void setNombreLaboreo(String NombreLaboreo) {
        this.NombreLaboreo = NombreLaboreo;
    }
    
    
    
    
}

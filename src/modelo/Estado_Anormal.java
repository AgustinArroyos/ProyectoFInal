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
public class Estado_Anormal {
    long codEstadoAnor;
    String situacion;

    public Estado_Anormal(long codEstadoAnor, String situacion) {
        this.codEstadoAnor = codEstadoAnor;
        this.situacion = situacion;
    }

    public long getCodEstadoAnor() {
        return codEstadoAnor;
    }

    public void setCodEstadoAnor(long codEstadoAnor) {
        this.codEstadoAnor = codEstadoAnor;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    
    
    
}

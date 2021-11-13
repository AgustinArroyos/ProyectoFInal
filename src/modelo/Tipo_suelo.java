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
public class Tipo_suelo {
    
    long codTipoSuelo;
    
    String Descripcion;
    
     ArrayList<Cultivo> cultivos;

    public Tipo_suelo(long codTipoSuelo, String Descripcion, ArrayList<Cultivo> cultivos) {
        this.codTipoSuelo = codTipoSuelo;
        this.Descripcion = Descripcion;
        this.cultivos = cultivos;
    }

    public long getCodTipoSuelo() {
        return codTipoSuelo;
    }

    public void setCodTipoSuelo(long codTipoSuelo) {
        this.codTipoSuelo = codTipoSuelo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public ArrayList<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }
     
      
}

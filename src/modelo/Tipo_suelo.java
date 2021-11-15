/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Tipo_suelo implements Serializable {
    @Id
    long codTipoSuelo;
    @Basic
    String Descripcion;
    @OneToMany(mappedBy = "tiposuelo")
    private List<Lote> lotes;

    public Tipo_suelo() {
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
    
    
     
      
}

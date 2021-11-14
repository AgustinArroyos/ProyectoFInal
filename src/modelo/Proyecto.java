/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.Entity;


public class Proyecto {
    
    long codProyecto;
    Date Fechainicio;
    Estado_Anormal estadoanormal;
    Lote lote;

    public Proyecto(long codProyecto, Date Fechainicio, Estado_Anormal estadoanormal, Lote lote) {
        this.codProyecto = codProyecto;
        this.Fechainicio = Fechainicio;
        this.estadoanormal = estadoanormal;
        this.lote = lote;
    }

    public long getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(long codProyecto) {
        this.codProyecto = codProyecto;
    }

    public Date getFechainicio() {
        return Fechainicio;
    }

    public void setFechainicio(Date Fechainicio) {
        this.Fechainicio = Fechainicio;
    }

    public Estado_Anormal getEstadoanormal() {
        return estadoanormal;
    }

    public void setEstadoanormal(Estado_Anormal estadoanormal) {
        this.estadoanormal = estadoanormal;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
    
    
    
    
    
}

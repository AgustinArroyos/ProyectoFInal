/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cultivo;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class ControladoraPersistencia {
    
    
    CultivoJpaController jpaCultivo = new CultivoJpaController();
    Tipo_sueloJpaController jpaTipo_suelo = new Tipo_sueloJpaController();
    
    public void altaCultivo(Cultivo cul){
        try{
        jpaCultivo.create(cul);
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
            
    }
    
     public void altaTiposuelo(Tipo_suelo tipo){
        try{
        jpaTipo_suelo.create(tipo);
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
            
    }
}

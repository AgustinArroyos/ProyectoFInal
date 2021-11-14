/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cultivo;
import modelo.Estado;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class ControladoraPersistencia {
    
    
    CultivoJpaController jpaCultivo = new CultivoJpaController();
    Tipo_sueloJpaController jpaTipo_suelo = new Tipo_sueloJpaController();
    EstadoJpaController jpaEstado = new EstadoJpaController();
    
    
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
    
      public Tipo_suelo buscarTiposuelo(long codsuelo){
     
          Tipo_suelo tipo = new Tipo_suelo();
          try{
             
            
            tipo = jpaTipo_suelo.findTipo_suelo(codsuelo);
        return tipo;
        
        
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
          
        
           return tipo; 
       
    }
     
     
      public void altaEstado(Estado estado){
        try{
        jpaEstado.create(estado);
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
          
        
    }
     
     
     
     
}

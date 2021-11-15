/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Campo;
import modelo.Cultivos;
import modelo.Estado;
import modelo.Lotes;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class ControladoraPersistencia {
    
    
    CultivoJpaController jpaCultivo = new CultivoJpaController();
    Tipo_sueloJpaController jpaTipo_suelo = new Tipo_sueloJpaController();
    EstadoJpaController jpaEstado = new EstadoJpaController();
    LoteJpaController jpaLote = new LoteJpaController();
    CampoJpaController jpaCampo = new CampoJpaController();
    
    public void altaCultivo(Cultivos cul){
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
      
      
      
      public void altalote(Lotes lote){
        try{
        jpaLote.create(lote);
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
    }
      
       public void altaCampo(Campo campo){
        try{
            
    
        jpaCampo.create(campo);
        
   
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);

                
               }
    }
       
       
       
       
       
       
       
       
       
        public Lotes buscarLote(long codlote){
     
          Lotes lote = new Lotes();
          
          try{
             
            
            lote = jpaLote.findLote(codlote);
            
        return lote;
        
        
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
          
        
           return lote; 
       
    }
         public Estado buscarEstado(long codestado){
     
          Estado estado = new Estado();
          try{
             
            
            estado = jpaEstado.findEstado(codestado);
        return estado;
        
        
        }
        catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
     
                
                }
          
        
           return estado; 
       
    }
      
       
      
     public List <Tipo_suelo> TraerSuelos(){

       return jpaTipo_suelo.findTipo_sueloEntities();

   }
     
     
      public List <Cultivos> TraerCultivos(){

          
       return jpaCultivo.findCultivoEntities();

   }
       public List <Lotes> TraerLotes(){

          
       return jpaLote.findLoteEntities();

   }
     
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import modelo.Campo;
import modelo.Cultivo;
import modelo.Estado;
import modelo.Lote;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void altaCultivo ( String nombreCUltivo ,long codCultivo , long codsuelo){
    
        Tipo_suelo suelo1 = new Tipo_suelo();
        
        
         suelo1 = controlPersis.buscarTiposuelo(codsuelo);
        
        
        Cultivo cul = new Cultivo();
        cul.setNombreCUltivo(nombreCUltivo);
        cul.setCodCultivo(codCultivo);
        cul.setSuelo(suelo1);
        
        controlPersis.altaCultivo(cul);
  
    
    }
    
     
    public void altatipoSuelo ( long codTipoSuelo, String Descripcion){
      
        Tipo_suelo tipo = new Tipo_suelo();
      tipo.setCodTipoSuelo(codTipoSuelo);
      tipo.setDescripcion(Descripcion);
      
        
        controlPersis.altaTiposuelo(tipo);
  
    
    }
    
    
     public void altaEstados (long codigoEstado, String nombreEstado ){
      
        Estado estado = new Estado();
        
        estado.setCodEstado(codigoEstado);
        estado.setNombreEstado(nombreEstado);
        
        
        
        
        controlPersis.altaEstado(estado);
  
    
    }
     
    
       
    public void altaLote (int superficie ,long idlote , long codsuelo){
    
        Tipo_suelo suelo1 = new Tipo_suelo();
        
        
        suelo1 = controlPersis.buscarTiposuelo(codsuelo);
        
        
        Lote lot = new Lote();
       
        lot.setEntero(superficie);
        lot.setNumeroDeLote(idlote);
        lot.setTiposuelo(suelo1);
        
        
        controlPersis.altalote(lot);
  
    
    }
    
    
     public void altaCampo (Long codigocampo ,String nombre ,String Ubicacion , long codigoLote, long codigoEstado){
    
        Campo campo = new Campo();
        Estado estado = new Estado();
        Lote lote = new Lote();
        
        estado = controlPersis.buscarEstado(codigoEstado);
        lote = controlPersis.buscarLote(codigoLote);
        
        campo.setCodCampo(codigocampo);
        campo.setEstado(estado);
        campo.setLote(lote);
        campo.setNombre_campo(nombre);
        campo.setUbicacionCampo(Ubicacion);
        
        controlPersis.altaCampo(campo);
        
        
        
        
        
        
        
    
    }
    
    
    
    
    
}

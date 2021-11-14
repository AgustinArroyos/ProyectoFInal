/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import modelo.Cultivo;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void altaCultivo ( long codCultivo, String nombreCUltivo){
    /*  
        Cultivo cul = new Cultivo();
        cul.setNombreCUltivo(nombreCUltivo);
        cul.setCodCultivo(codCultivo);
        
        controlPersis.altaCultivo(cul);
  */
    
    }
    
     
    public void altatipoSuelo ( long codTipoSuelo, String Descripcion){
      
        Tipo_suelo tipo = new Tipo_suelo();
      tipo.setCodTipoSuelo(codTipoSuelo);
      tipo.setDescripcion(Descripcion);
      
        
        controlPersis.altaTiposuelo(tipo);
  
    
    }
    
    
    
    
    
    
    
    
    
    
}

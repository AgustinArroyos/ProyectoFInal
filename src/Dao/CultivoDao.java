/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.util.List;

import  modelo.Cultivos;
/**
 *
 * @author sring
 */
public interface CultivoDao {
    
    void insertar(Cultivos c);
    
    List <Cultivos> obtenerTodos(); 
    
}

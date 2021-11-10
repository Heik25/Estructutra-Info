/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import static co.edu.ucundinamarca.tallern.Main.log;
import java.util.logging.Logger;

/**
 *
 * @author Reinel
 */
public class Cola {
    
   

    
    Nodo iniciocola, finalcola;
    String Cola = "";
    int llegada, salida;
    
    public Cola(){
    
        iniciocola = null;
        finalcola= null;
    }
    
    public int getllegada() {
        return llegada;
    }

    public int getsalida() {
        return salida;
    }
    //metodo para saber si la cola esta vacia
    public boolean colavacia(){
    
        if(iniciocola==null){
        
            return true;
        }else{
        
            return false;
        }
    }
    
    public void ingresarnodo(String id_usuario,String nombre, String libro){
    
        Nodo Nuevo = new Nodo();
        Nuevo.nombre = nombre;
        Nuevo.id_usuario = id_usuario;
        Nuevo.libro = libro;
        
        if(iniciocola==null){
        
            iniciocola=Nuevo;
            iniciocola.siguente = iniciocola;
            Nuevo.anterior = finalcola;
            finalcola = Nuevo;
        }else{
        
            finalcola.siguente=Nuevo;
            Nuevo.siguente=iniciocola;
            Nuevo.anterior=finalcola;
            finalcola=Nuevo;
            iniciocola.anterior=finalcola;
        }
        llegada++; 
    }
    
     public void En_espera(){
        Nodo actual= new Nodo();
        actual=iniciocola;
        do{
            log.info("ID:"+actual.getid_usuario()+"\nNombres:"
              +actual.getnombre()+"\nDatos del libro:"+actual.getlibro());
            actual=actual.siguente;
        }while(actual!=iniciocola);
    }
    
    public void En_salida(){
        Nodo actual= new Nodo();
        Nodo anterior= new Nodo();
         
        actual=iniciocola;
        anterior=finalcola;
        
        if(actual==iniciocola){
            log.info(actual.getnombre()+" con identificación: "+actual.getid_usuario()+" atendido");
           
            iniciocola=iniciocola.siguente;
            finalcola.siguente=iniciocola;
           iniciocola.anterior=finalcola;
          
        }
        salida++;
      
        anterior=actual;
        actual=actual.siguente;
      
      
    }

    void En_esperar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

/**
 *
 * @author Reinel
 */
import java.util.logging.Logger;

public class Juego {
    
  static Logger log = Logger.getLogger(Juego.class.getName());  

  public int vidas, record;
  
  private int vidas2 = 5;

  public void vidasComenzando(){
    vidas = vidas2;   
  }
  public void quitaVida(){
    vidas = vidas - 1;  
    if(vidas == 0){
      log.info("Juego terminado");      
    }    
  }
  public void PartidaReiniciada(){
    vidasComenzando();
  }
  public void actualizaRecord(){
    if(vidas==record){
      log.info("record alcanzado");      
    }
    if(vidas>record){
      log.info("new record");    
    }    
  }
 
  public void muestraVidasRestantes(){
    log.info("Vidas actuales = " + vidas);  
  }
 } 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import org.apache.log4j.Logger;

/**
 *
 * @author Reinel
 */
public class Main2 {
    
    static Logger log = Logger.getLogger(Juego.class.getName());
    
    public static void main(String[] args) {
        
      Juego objQuitaVida = new Juego();
      objQuitaVida.quitaVida();
      
      Juego objMuestraVidas = new Juego();
      objMuestraVidas.muestraVidasRestantes();
      
      Juego objReiniciaPartida = new Juego();
      objReiniciaPartida.PartidaReiniciada();
      
      Juego objMuestraVidasR = new Juego();
      objMuestraVidasR.muestraVidasRestantes();
      
      Juego objActualR = new Juego();
      objActualR.actualizaRecord();
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Reinel
 */
public class SeleccionColombia {

    private static Object jugadorUno;
    
    
  private SeleccionColombia(String hanner, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       
            public static void mainSleccion(String[] args) {

  SeleccionColombia jugadoruno = new SeleccionColombia("Hanner", 10, 20);
        SeleccionColombia jugadorDos = new SeleccionColombia("Hanner", 10, 20);

        if (jugadorUno.equals(jugadorDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }
        

    }

     HashSet jugadores = new HashSet<>();

   
     
    public void agregarjugador(){
    
jugadores.add("Jordi Alba");
jugadores.add("Pique");
jugadores.add("Busquets");
jugadores.add("Iniesta");
jugadores.add("Messi");

    }
    
    public void mostrarjugadores(){
    int i = 0;
Iterator it = jugadores.iterator();
while(it.hasNext()){
System.out.print(it.next());
if(jugadores.size()-1 > i){
System.out.print(",");
i++;
}
}
System.out.println();

    }
    
 public void contieneJugador(String nombreJugador){
        
        
    if(jugadores.contains(nombreJugador)){
System.out.println("Neymar Si está en el conjunto");
}else{
System.out.println("Neymar No está en el conjunto");
}
    }
}

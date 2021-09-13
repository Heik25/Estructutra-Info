/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Reinel
 */
public class Semana {
    
    public static void mainDia(String[] args) {

ArrayList listDias = new ArrayList();
listDias.add("Lunes");
listDias.add("Martes");
listDias.add("Miercoles");
listDias.add("Jueves");
listDias.add("Viernes");
listDias.add("Sabado");
listDias.add("Domingo");



 
}
ArrayList listDias;

    public Semana() {
        this.listDias = new ArrayList(listDias);
    }
 public void CargarDias(){
    
 Iterator it = listDias.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
 
 public int cuantos(){
return listDias.size();
}
 
 public void obtenerDia(int numDia){
 if (listDias.contains(int numDia)){
System.out.println("Si existe");
}
 
 }
public void mostrarDias(){
Iterator it2 = listDias.iterator();
while(it2.hasNext()){
if(it2.next().toUpperCase()==»LUNES»){
System.out.println("Si existe");
}
}
 
 }
}


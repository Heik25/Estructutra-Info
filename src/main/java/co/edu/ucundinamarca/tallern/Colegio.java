/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.*;

public class Colegio {
    Map alumno = new HashMap();

public void AgregarAlumno(String nacionalidad){
if (alumno.containsKey(nacionalidad)){
Integer i = (Integer) alumno.get(nacionalidad);
alumno.remove(nacionalidad);
alumno.put(nacionalidad, i++);
}else{
alumno.put(nacionalidad,1);
}
}

public void MostrarTodosAlumno(){
Iterator it = alumno.keySet().iterator();
while (it.hasNext()){
Integer key = (Integer) it.next();
System.out.println("Numero de alumno:"+alumno.get(key));
}}



public int cuantos(){
return alumno.size();
}

public void borrar(String nacionalidad){
alumno.remove(nacionalidad);
}
}

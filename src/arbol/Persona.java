/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author Reinel
 */
public class Persona {
    String nombre;
    int edad;
    int Id;
    
    public Persona(String nom,int ed,int id){
    nombre = nom;
    edad = ed;
    Id = id;
               
    }
    
    public int ascii(){
    int var;
    var = nombre.codePointAt(0);
    return var;
    }
    public String Nombre(){
    return nombre;
    }
     public int Edad(){
    return edad;
    }
      public int Ident(){
    return Id;
    }
}

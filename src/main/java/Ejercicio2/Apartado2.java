/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.io.*;
/**
 *
 * @author Reinel
 */
public class Apartado2 {
    
    public static void main(String args[]) {

    FileReader f = null; 
    BufferedReader reader = null; 
    String line = null;
    Apartado2 stack = new Apartado2(); 

    if (args.length < 1) {
      System.err.println("porfavor accionar el programa:");
      System.err.println("\tLinkedStack file");
    }

    // opens the file
    try {
      f = new FileReader(args[0]);
      reader = new BufferedReader(f);
      while ((line = reader.readLine()) != null)
        stack.push(line);
    } catch (Exception e) {
      System.err.println("archivo no encontrado " + args[0]);
      return;
    }

    
    while ((line = (String) stack.pop()) != null) {
      System.out.println(line);
    }
  }

    private void push(String line) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

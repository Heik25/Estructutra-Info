/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Reinel
 */
public class Dulces {
    
    static logger log = logger.getlogger(Dulces.class.getName());
    
     static ArrayList<String> arrayliast = new ArrayList<String>();
     
public static void Ingresardulces(){

for(int d = 0; d<10; d++){
    
    Scanner Teclado = new Scanner(System.in);
    log.info("ingresar los dulces de su agrado :");
    String arrayliast = Teclado.nextLine();
    arrayliast.add(arrayliast);
}
}		
		
public static void main(String[] args){
Ingresardulces();
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucesion;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Reinel
 */
public class MainSucesion {

    static Logger log = Logger.getLogger(MainSucesion.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;//varaible de sucesion
        log.info("Digite el numero :");
        n = leer.nextInt();
        log.info(Sucesion.sucesion(n));
        Sucesion.mostrarContador();
    }
}

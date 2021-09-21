/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucesion;

import org.apache.log4j.Logger;

/**
 *
 * @author Reinel
 */
public class Sucesion {

    public static int contador = 0;
    static Logger log = Logger.getLogger(MainSucesion.class.getName());

    public static double sucesion(int n) {
        contador++;
        switch (n) {
            case 0:
                return 1;
            case 1:
                return 2;

            default:
                return 0.91 * sucesion(n - 1) + 0.1 * sucesion(n - 2);
        }

    }

    public static void mostrarContador() {
        log.info("Cantidad de ejecuciones:" + contador);
    }

}

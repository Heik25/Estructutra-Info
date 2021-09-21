/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Potencia;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * 
 *
 * @author Reinel
 */
public class Main {

    public static double pedirNumero(double numero) {
        Scanner copiar = new Scanner(System.in);
        if (numero < 0) {
            do {
                System.out.println("el numero digitado es incorrecto por favor digite un numero positivo:...");
                numero = copiar.nextDouble();
            } while (numero < 0);
            return numero;
        }
        return numero;
    }

    public static double factorial(double numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return (numero * factorial(numero - 1));
        }
    }

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner copiar = new Scanner(System.in);
        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");
        System.out.println("-------------------------  Factorial  -----------------------------------");
        //pedir numero
        System.out.println("digite el numero: ");
        double numero = copiar.nextDouble();
        System.out.println("el valor es: " + factorial(pedirNumero(numero)));
    }

}

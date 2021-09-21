/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import java.util.InputMismatchException;
import java.util.Scanner;
import Factorial.Funciones;

/**
 *
 * @author Reinel
 */
public class MainPruebaFunciones {

    public static void main(String[] args) {
        Funciones obj = new Funciones();
        Scanner text = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println(" ---------   MENU   --------");
            System.out.println("1. Factorial");
            System.out.println("2. Esponencial");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = text.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("-------------------------  Factorial  -----------------------------------");
                        //pedir numero
                        System.out.println("digite el numero: ");
                        double numero = text.nextDouble();
                        System.out.println("el valor es: " + obj.factorial(obj.pedirNumero(numero)));
                        break;
                    case 2:
                        System.out.println(" --------------   POTENCIA  ----------------------------");
                        System.out.println("Introduce la base: ");
                        int base = text.nextInt();
                        System.out.println("Introduce el exponente: ");
                        int exponente = text.nextInt();
                        System.out.println("el valor es: " + obj.potencia(base, exponente));
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                text.next();
            }
        }
    }
}

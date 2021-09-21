/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import java.util.Scanner;

/**
 *
 * @author Reinel
 */
public class Funciones {
     public double pedirNumero(double numero) {
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

    public double factorial(double numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return (numero * factorial(numero - 1));
        }
    }
    
    public double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return potencia(base, exponente + 1) / base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}

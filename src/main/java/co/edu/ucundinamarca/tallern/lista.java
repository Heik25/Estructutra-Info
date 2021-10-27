package co.edu.ucundinamarca.tallern;


import javax.swing.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class lista {
    Nodo primero;
    Nodo ultimo;
    private int dato;

    static Logger log = Logger.getLogger(Main.class.getName());
    Scanner leer = new Scanner(System.in);

    public lista() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int numero) {
        Nodo nuevo = new Nodo();
        nuevo.datos = numero;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo.anterior = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }

    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = primero;


        do {
            log.info(String.valueOf("<-" + actual.datos + "->"));
            actual = actual.siguiente;

        } while (actual != primero);
    }

    public void buscar(int x) {

        Nodo actual = new Nodo();

        actual = ultimo;

        boolean encontrado = false;


        do {

            if (actual.datos == x) {

                encontrado = true;

                dato = actual.datos;

            }

            actual = actual.siguiente;

        } while (actual != ultimo);


        if (encontrado == true) {

            System.out.println("Cantidad encontrada  \n" + dato);

        } else {

            System.out.println("Cantidad no encontrada  \n" + dato);

        }

    }

    public void modificar(int x) {
        Nodo actual = new Nodo();
        actual = primero;

        do {
            if (actual.datos == x) {
                log.info("Digite la nueva cantidad");
                actual.datos = leer.nextInt();

            }
            actual = actual.siguiente;

        } while (actual != primero);
    }

}
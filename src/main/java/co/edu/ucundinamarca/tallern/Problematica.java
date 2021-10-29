
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;


public class Problematica {

    static Logger log = Logger.getLogger(Problematica.class.getName());

    public static nodo primero;
    public static nodo ultimo;

    public static void main(String[] args) {
        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");

        Problematica eliminado = new Problematica();

        eliminado.listnombre(1, "Francisco");
        eliminado.listnombre(2, "jorge");
        eliminado.listnombre(3, "luis");
        eliminado.listnombre(4, "Sergio");
        eliminado.listnombre(6, "salvador");
        eliminado.listnombre(7, "Diego");
        eliminado.listnombre(8, "Mario");
        eliminado.mostrarlist(4);
    }

    public Problematica() {
        primero = null;
        ultimo = null;
    }

    public void mostrarlist(int numero) {
        nodo puesto = new nodo();

        puesto = primero;

        while (puesto != null) {

            if (puesto.lugar == numero) {
                log.info("salio:" + puesto.nombre);
            }
            puesto = puesto.siguiente;

            return;
        }

    }

    public void listnombre(int lugar, String nombre) {
        nodo pocision = new nodo();
        pocision.lugar = lugar;
        pocision.nombre = nombre;

        if (primero == null) {
            primero = pocision;
            pocision.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = pocision;
            pocision.siguiente = primero;
            ultimo = pocision;
        }
    }
}

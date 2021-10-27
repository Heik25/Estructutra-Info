package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class ListaDoble implements Listable {
    static Logger log = Logger.getLogger(Dulces.class.getName());
    private NodoDoble inicio, fin;
    private boolean vacio;
    private int longitud;

    public ListaDoble() {
        inicio = fin = null;
    }

    
    public void agregar(Object elemento) {
        NodoDoble nodonuevo = new NodoDoble();
        nodonuevo.elemento = elemento;
        if (inicio == null) {
            inicio = nodonuevo;
            inicio.anterior = null;
            inicio.siguiente = null;
            fin = inicio;
        } else {
            fin.siguiente = nodonuevo;
            nodonuevo.anterior = fin;
            nodonuevo.siguiente = null;
            fin = nodonuevo;

        }
        longitud++;


    }

  
    public boolean contiene(Object n) {
        boolean contieneValor = false;
        ListaDoble.NodoDoble puntero = new ListaDoble.NodoDoble();
        puntero = inicio;

        while (puntero != null) {
            if (puntero.elemento == n) {
                log.info("Nodo encontrado");
                log.info(puntero.elemento);
                contieneValor = true;
            }
            puntero = puntero.siguiente;
        }
        return contieneValor;
    }

  
    public void eliminar(Object elemento) {
        ListaDoble.NodoDoble actual = new ListaDoble.NodoDoble();
        ListaDoble.NodoDoble atras = new ListaDoble.NodoDoble();
        actual = inicio;
        atras = null;

        while (actual != null) {
            if (actual.elemento == elemento) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;

                } else {
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;

                }
                longitud--;
            }
            atras = actual;
            actual = actual.siguiente;

        }


    }

  
    public boolean estaVacia() {


        {
            if (inicio == null) {
                vacio = true;
                log.info("lista vacia");

            } else {
                vacio = false;
                log.info("Lista con elementos");
            }
            return vacio;
        }
    }

   
    public Object primerElemento() {
        log.info(inicio.elemento);
        return inicio.elemento;
    }

   
    public void vaciar() {
        ListaDoble.NodoDoble nodo = new ListaDoble.NodoDoble();
        if (inicio != null) {
            inicio = null;
            nodo.siguiente = inicio;
        }
        log.info("elementos Borrados");
        estaVacia();
        longitud--;
        log.info(longitud);


    }

    
    public void sustituir(int n, Object elemento) {
        ListaDoble.NodoDoble actual = new ListaDoble.NodoDoble();
        if (inicio == null) {
            inicio = actual;
        } else {
            ListaDoble.NodoDoble puntero = inicio;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            actual.siguiente = puntero.siguiente;
            puntero.siguiente = actual;

        }


    }

   
    public int iterador() {
        return longitud;
    }

    private class NodoDoble {
        public Object elemento;
        public ListaDoble.NodoDoble siguiente, anterior;

        public NodoDoble() {

        }


    }
}

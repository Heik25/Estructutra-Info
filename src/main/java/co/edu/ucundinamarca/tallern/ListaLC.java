
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;



public class ListaLC {

    static Logger log = Logger.getLogger(Main.class.getName());

  NodoLC ultimo;

  public ListaLC(){
    ultimo = null;
  }
  public boolean estaVacia(){
    return ultimo == null;
  }
  public ListaLC insertar(int elemento){
    NodoLC nuevo = new NodoLC(elemento);

    if(ultimo != null){
      nuevo.siguiente = ultimo.siguiente;
      ultimo.siguiente = nuevo;
    }
    ultimo = nuevo;
    return this;
  }
  public void mostrarLista(){
    NodoLC auxiliar = ultimo.siguiente;
    String cadena = "";
    do{
      cadena = cadena + "[" + auxiliar.dato + "] -> ";
      auxiliar = auxiliar.siguiente;

    }while(auxiliar != ultimo.siguiente);
      log.info(cadena + "\nMostrando lista circular");
  }

}

package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;


public class Primer {

  class Nodo {
    Object elem;
    Nodo Siguiente;

    public Nodo(Object o) {
      elem = o;
      Siguiente = null;
    }
  }

  Nodo end;
  int size;

  public Primer() {
    end = null;
    size = 0;
  }

  public void push(Object o) {
    Nodo new_node = new Nodo(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Siguiente = end;
      end = new_node;
    }
    size++;
  }; 

  public Object pop() {
    if (end == null)
      return null;
    
    Object o = end.elem;
    end = end.Siguiente;
    size--;
    return o;
  }
  public boolean isEmpty() {

    return (size == 0);
  }

  public int size() {

    return size;
  }

  public Object end() {

    if (end == null)
      return null;
    else
      return end.elem;
  }
}
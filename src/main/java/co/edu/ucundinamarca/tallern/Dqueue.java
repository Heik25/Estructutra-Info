/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Reinel
 */
interface Dqueue {
    public class DLDqueue implements Dqueue {
  DNode head, tail;
  int size;

  public DLDqueue() {
    head = new DNode();
    tail = new DNode();
    head.setNext(tail);
    tail.setPrev(head);
    size = 0;
  }

  public void insertFirst(Object obj) {
    DNode h = head;
    DNode nodo = new DNode();
    nodo.setVal(obj);
    nodo.setNext(h);
    h.setPrev(nodo);
    head = nodo;
    if (size == 0)
      tail = nodo;
    size++;

  }

  public void insertLast(Object obj) {
    DNode t = tail;
    DNode nodo = new DNode();
    nodo.setVal(obj);
    nodo.setPrev(t);
    t.setNext(nodo);
    tail = nodo;
    if (size == 0)
      head = nodo;
    size++;
  }

  public Object removeFirst() {
    if (head == null)
      return null;
    Object val = head.getVal();
    head = head.getNext();
    size--;
    return val;
  }

  public Object removeLast() {
    if (tail == null)
      return null;
    Object val = tail.getVal();
    tail = tail.getPrev();
    size--;
    return val;
  }

  public int size() {
    return size;
  }

  public String toString() {
    String s = "head [";
    DNode aux = head;
    for (int i = 0; i < size; i++) {
      s += aux.getVal();
      if (aux == tail) {
        break;
      }
      s += "-";
      aux = aux.getNext();
    }
    return s + "] tail";
    
}
}
}

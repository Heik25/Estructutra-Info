/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Reinel
 */
public class apatado1 {
    
    class Node {
    Object elem;
    Node Next;

    public Node(Object o) {
      elem = o;
      Next = null;
    }
  }

  Node end;
  int size;

  public apatado1() {
    end = null;
    size = 0;
  }

  public void push(Object o) {
    Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++;
  }; // inserts an object onto the stack

  public Object pop() {
    if (end == null)
      return null;
    ;
    Object o = end.elem;
    end = end.Next;
    size--;
    return o;
  }// Gets the object from the stack

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

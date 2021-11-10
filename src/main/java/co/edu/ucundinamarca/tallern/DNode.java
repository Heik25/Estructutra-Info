/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Reinel
 */
public class DNode {
    DNode next, prev;
  Object val;

  public DNode() {

    this.next = null;
    this.prev = null;
    this.val = null;
  }

  public DNode(Object val, DNode first, DNode last) {

    this.next = first;
    this.prev = last;
    this.val = val;
  }

  public DNode getNext() {
    return next;
  }

  public void setNext(DNode next) {
    this.next = next;
  }

  public DNode getPrev() {
    return prev;
  }

  public void setPrev(DNode prev) {
    this.prev = prev;
  }

  public Object getVal() {
    return val;
  }

  public void setVal(Object val) {
    this.val = val;
  }

}
	  



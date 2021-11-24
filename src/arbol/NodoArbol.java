
package arbol;


public class NodoArbol {
    Persona dato;
    NodoArbol izq,der;
    
    public NodoArbol(Persona d){
     dato = d;
     izq=der=null;
    }
    
    public String toString(){
    return "el dato es:"+dato;
    }
}

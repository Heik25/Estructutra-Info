package co.edu.ucundinamarca.tallern;

public interface Listable {

    public void agregar(Object elemento);

    public boolean contiene(Object n);

    public void eliminar(Object elemento);

    public boolean estaVacia();

    public Object primerElemento();

    public void vaciar();

    public void sustituir(int n, Object elemento);

    public int iterador();


}
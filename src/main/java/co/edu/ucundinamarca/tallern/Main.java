package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Clase Principal
 * @author Reinel
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

      Scanner intr = new Scanner (System.in);

      ListaLC lista = new ListaLC();

      int opcion = 0, elemento = 0;

      do{
        try{
          log.debug("\n1. Agregar nodo la lista circular\n"
                  + "2. Mostrar lista circular\n"
                  + "3. Salir\n");

          opcion = intr.nextInt();

          switch (opcion){
              case 1:
                  log.info("\nIngrese el elemento del nodo");
                  elemento = intr.nextInt();
                  log.info("Agregando nodo al inicio");
                  lista.insertar(elemento);
                  break;

              case 2:
                  if(!lista.estaVacia()){
                    lista.mostrarLista();
                  }else{
                      log.info("Lista vacia");
                  }
                  break;
              case 3:
                  log.info("Aplicacion finalizada");

              default:
                  log.info(" ");


          }
        }catch(NumberFormatException n){
            log.info("Error");
        }

      }while(opcion != 3);

    }

}
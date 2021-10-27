
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 *
 * @author Reinel
 */

public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());
    public static ArrayList<String> listaDulces = new ArrayList<String>();

    public static void añadirElementos() {
        listaDulces.add("ChocoRamo");
        listaDulces.add("Gala");
        listaDulces.add("Chiclets");
        listaDulces.add("Barrilete");
        listaDulces.add("Gol");
        listaDulces.add("Glasitas");
        listaDulces.add("Oka loka");
        listaDulces.add("Gansito");
        listaDulces.add("Trululu");
        listaDulces.add("Bon bon bum");
    }

    public static int imprimirIterando() {

        log.info("imprimiendo con iterador");
        for (int i = 0; i < listaDulces.size(); i++) {
            log.info(listaDulces.get(i));
            log.info(i + 1);

        }
        return listaDulces.size();

    }

    public static boolean imprimirSinIterador() {
        boolean encontrado = false;
        
        log.info("imprimiendo sin iterador");
        for (String lista : listaDulces) {
            log.info(lista);
        }
        if (listaDulces.contains("ChocoRamo")) {
            encontrado = true;
            log.info("Encontrado");
        }
        return encontrado;

    }

    public static void main(String[] args) {

        añadirElementos();
        imprimirIterando();
        imprimirSinIterador();


    }
}
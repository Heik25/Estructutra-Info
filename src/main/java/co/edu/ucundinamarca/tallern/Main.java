package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroingresar;
        int numerobuscar;
        int numeromodificar;

        lista ejemplo = new lista();
        int opcion;

        do {
            log.info("\n+++++Bienvenido al carrito de compras+++++\n"+
                    "1.Ingresar la cantidad de cada producto\n" +
                    "2.Mostrar datos\n" +
                    "3.Buscar datos\n" +
                    "4.Modificar datos\n" +
                    "5.salir");
            
            log.info("Digite la opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    log.info("Digite La cantidad");
                    numeroingresar = leer.nextInt();

                    ejemplo.ingresar(numeroingresar);
                    break;
                    
                case 2:
                    
                    log.info("+++++Mostrando las cantidades+++++");
                    ejemplo.mostrar();
                    break;
                    
                case 3:
                    
                    log.info("+++++Ingrese la cantidad a buscar+++++");
                    numerobuscar = leer.nextInt();
                    break;
                    
                case 4:
                    
                    log.info("+++++Digite la cantidad a cambiar+++++");
                    numeromodificar = leer.nextInt();
                    ejemplo.modificar(numeromodificar);
                    break;
                    
                case 5:
                    
                    log.info("");
                    break;
                    
                default:
                    log.info("ERROR");
            }


        } while (opcion != 5);
    }
}
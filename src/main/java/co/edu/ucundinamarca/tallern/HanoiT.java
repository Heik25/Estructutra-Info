package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class HanoiT {

    static Logger log = Logger.getLogger(HanoiT.class.getName());

    public static Pil fila1 = new Pil();
    public static Pil fila2 = new Pil();
    public static Pil fila3 = new Pil();

    public static int topDisco;
    public static int numDiscos = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= numDiscos; i++) {
            fila1.insertar(i);
        }

        log.info("\nprimero\t\t" + fila1.listar() + "\nayuda\t\t"
                + fila2.listar() + "\nultimo\t\t" + fila3.listar() + "\n");
        Pasos(Integer.parseInt(fila1.ACabeza()), 1, 2, 3);
    }

    public static void Pasos(int n, int primero, int ayuda, int ultimo) {
        if (n == 1) {
            if (primero == 1) {
                topDisco = Integer.parseInt(fila1.ACabeza());
                fila1.AQuitar();
            }
            if (primero == 2) {
                topDisco = Integer.parseInt(fila2.ACabeza());
                fila2.AQuitar();
            }
            if (primero == 3) {
                topDisco = Integer.parseInt(fila3.ACabeza());
                fila3.AQuitar();
            }

            if (ultimo == 1) {
                fila1.insertar(topDisco);
            }
            if (ultimo == 2) {
                fila2.insertar(topDisco);
            }
            if (ultimo == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nPrimero: " + fila1.listar()
                    + "\nAyuda: " + fila2.listar()
                    + "\nUltimo: " + fila3.listar());
        } else {
            Pasos(n - 1, primero, ayuda, ultimo);
            log.info("Mover de: " + primero + " hacia " + ultimo);
            if (primero == 1) {
                topDisco = Integer.parseInt(fila1.ACabeza());
                fila1.AQuitar();
            }
            if (primero == 2) {
                topDisco = Integer.parseInt(fila2.ACabeza());
                fila2.AQuitar();
            }
            if (primero == 3) {
                topDisco = Integer.parseInt(fila3.ACabeza());
                fila3.AQuitar();
            }

            if (ultimo == 1) {
                fila1.insertar(topDisco);
            }
            if (ultimo == 2) {
                fila2.insertar(topDisco);
            }
            if (ultimo == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nprimero: " + fila1.listar()
                    + "\nayuda: " + fila2.listar()
                    + "\nultimo: " + fila3.listar());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            Pasos(n - 1, ayuda, primero, ultimo);

        }
    }

}

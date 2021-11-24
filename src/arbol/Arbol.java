
package arbol;

import java.io.*;

public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{

        String nombre = "";
        int edad = 0;
        int iden = 0;
        int op = 0, orden = 0;
        boolean V = true;
        String eliminar;
        BufferedReader re;
        re = new BufferedReader(new InputStreamReader(System.in));
        Persona p;
        ArbolBin n = new ArbolBin();
        while (V) {
            try {
                System.out.println("1. Ingrese Datos");
                System.out.println("2. Mostrar datos InOrden");
                System.out.println("3. Mostrar datos PreOrden");
                System.out.println("4. Mostrar datos PostOrden");
                System.out.println("5. Mostrar persona");
                System.out.println("6. eliminar dato menor");
                System.out.println("7. eliminar dato mayor");
                System.out.println("8. eliminar dato por nombre");
                System.out.println("9. salir");
                op = Integer.parseInt(re.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("ERROR" + e);
            }
            switch (op) {

                case 1:
                try {
                    System.out.println("nombre");
                    nombre = re.readLine();
                } catch (IOException e) {
                    System.out.println("ERROR" + e);

                }

                try {
                    System.out.println("edad");
                    edad = Integer.parseInt(re.readLine());
                    System.out.println("iden");
                } catch (IOException | NumberFormatException e) {
                    System.out.println("ERROR" + e);
                }
                iden = Integer.parseInt(re.readLine());
                p = new Persona(nombre, edad, iden);

                n.Insertarnombre(p);

                break;

                case 2:
                    n.InOrden(n.raiz);
                    break;

                case 3:
                    n.PreOrden(n.raiz);
                    break;

                case 4:
                    n.PostOrden(n.raiz);
                    break;

                case 5:
                    n.hermanos(n.raiz);

                    break;

                case 6:
                    n.borrarMenor();
                    break;

                case 7:
                    n.borrarMayor();
                    break;

                case 8:
                    System.out.println("INGRSE EL NOMBRE QUE DESEA ELIMINAR");
                    eliminar = re.readLine();
                    p = new Persona(eliminar, op, op);
                    n.Eliminar(p);
                    break;

                default:
                    V = false;
                    break;

            }
        }
    }


}

    

   
    


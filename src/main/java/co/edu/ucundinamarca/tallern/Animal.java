
package co.edu.ucundinamarca.tallern;

import java.util.Objects;

public class Animal {
    
    private String nombre;
    private String especie;
    private int patas;
    private int edad;
    private int identificacion;
    private Object Objects;

    public Animal(String nombre, int patas, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.especie = especie;
        this.patas = patas;
        
    }

    public static void main(String[] args) {

        Animal animalUno = new Animal("Hanner", 10, 20);
        Animal animalDos = new Animal("Hanner", 10, 20);

        if (animalUno.equals(animalDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }

    }

    @Override
    public String toString() {
        return "Animal [nombre : " + getNombre() + " edad : " + getEdad() + " Identificacion : " + getIdentificacion() +" patas : " + getpatas() +" especie : " + getespecie() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Animal that = (Animal) obj;
        return Objects.equals(this.getNombre(),that.getNombre()) &&
                Objects.equals(this.getEdad(),that.getEdad()) &&
                Objects.equals(this.getespecie(),that.getespecie()) &&
                Objects.equals(this.getIdentificacion(),that.getIdentificacion());
        
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        result = 4 * result + getpatas();
        return result;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    private int getpatas() {
        return patas;
    }
    
    public void setpatas(int patas) {
        this.patas = patas;
    }

    private String getespecie() {
        return especie;
    }
    
     public void setespecie(String especie) {
        this.especie = especie;
    }
}

package tp3.introduccion_poo;

public class Gallina {

    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public void envejecer() {
        edad += 1;
    }

    public void mostrarEstado() {
        System.out.println("La gallina " + idGallina + " tiene " + edad + " años y ha puesto " + huevosPuestos + " huevos");
    }

}

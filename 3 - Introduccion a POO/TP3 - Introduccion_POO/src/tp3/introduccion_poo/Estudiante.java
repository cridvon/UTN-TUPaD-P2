package tp3.introduccion_poo;

public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public void mostrarInfo() {
        System.out.println("El estudiante " + nombre + " " + apellido + ", del curso " + curso + ", tiene una calificacion de " + calificacion + " punto/s.");
    }

    public void subirCalificacion(double puntos) {
        double nuevaCalificacion = calificacion + puntos;
        if (nuevaCalificacion <= 10) {
            calificacion = nuevaCalificacion;
            System.out.println("Se aumenta la calificacion.");
            System.out.println("Calificacion actual: " + calificacion);
        } else {
            System.out.println("No es posible subir " + puntos + " punto/s. La calificacion maxima no puede superar a 10");
            System.out.println("Calificacion actual: " + calificacion);
        }
    }

    public void bajarCalificacion(double puntos) {
        double nuevaCalificacion = calificacion - puntos;
        if (nuevaCalificacion >= 0) {
            calificacion = nuevaCalificacion;
            System.out.println("Se disminuye la calificacion.");
            System.out.println("Calificacion actual: " + calificacion);
        } else {
            System.out.println("No es posible restar " + puntos + " punto/s. La calificacion mínima debe ser 0");
            System.out.println("Calificacion actual: " + calificacion);
        }
    }
}

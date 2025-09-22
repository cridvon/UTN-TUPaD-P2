/*
    PROGRAMACIÓN II
    Trabajo Práctico 3: Introducción a la Programación Orientada a Objetos

    Alumno: Chiavón, Cristian
    Comisión: M2025-11
 */

package tp3.introduccion_poo;

public class TP3Introduccion_POO {

    public static void ejercicio1() {

        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Cristian";
        estudiante.apellido = "Vera";
        estudiante.curso = "Comision 11";
        estudiante.calificacion = 9;

        estudiante.mostrarInfo();
        estudiante.subirCalificacion(5);
        estudiante.subirCalificacion(1);
        estudiante.bajarCalificacion(3);
        estudiante.mostrarInfo();
    }

    public static void ejercicio2() {

        Mascota mascota = new Mascota();

        mascota.nombre = "Olivia";
        mascota.especie = "Perro";
        mascota.edad = 8;

        mascota.mostrarInfo();
        
        for (int i=0; i < 4; i++){
            mascota.cumplirAnios();//Suma de a 1 año
            mascota.mostrarInfo();
        }

    }

    public static void ejercicio3() {

        Libro libro = new Libro();

        libro.setTitulo("Mas respeto que soy tu madre");
        libro.setAutor("Hernan Casciari");
        libro.setAnioPublicacion(2020);
        System.out.println("El libro se titula " + libro.getTitulo() + " y fue escrito por " + libro.getAutor() + " en " + libro.getAnioPublicacion());

        libro.setAnioPublicacion(2026);
        System.out.println("El libro se titula " + libro.getTitulo() + " y fue escrito por " + libro.getAutor() + " en " + libro.getAnioPublicacion());

        libro.setAnioPublicacion(2017);
        System.out.println("El libro se titula " + libro.getTitulo() + " y fue escrito por " + libro.getAutor() + " en " + libro.getAnioPublicacion());               

    }

    public static void ejercicio4() {

        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();

        gallina1.idGallina = 1;
        gallina1.edad = 1;
        gallina1.huevosPuestos = 0;

        gallina2.idGallina = 2;
        gallina2.edad = 1;
        gallina2.huevosPuestos = 0;

        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();

        gallina1.mostrarEstado();
        
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();

        gallina2.mostrarEstado();

    }

    public static void ejercicio5() {

        NaveEspacial nave = new NaveEspacial("Voyager", 50);

        nave.mostrarEstado();
        System.out.println("Intento avanzar");
        nave.avanzar(10);
        System.out.println("Intento despegar");
        nave.despegar();
        nave.mostrarEstado();
        System.out.println("Recargo 50");
        nave.recargarCompustible(50);
        System.out.println("Intento despegar");
        nave.despegar();
        System.out.println("Intento avanzar 10");
        nave.avanzar(10);
        System.out.println("Intento avanzar 20");
        nave.avanzar(20);
        nave.mostrarEstado();
        System.out.println("Regargo 90");
        nave.recargarCompustible(90);
        System.out.println("Intento avanzar 30");
        nave.avanzar(30);
        System.out.println("Veo estado actual");
        nave.mostrarEstado();

    }

    public static void main(String[] args) {

        System.out.println("\n----- EJERCICIO 1 ----------");
        ejercicio1();
        System.out.println("\n----- EJERCICIO 2 ----------");
        ejercicio2();
        System.out.println("\n----- EJERCICIO 3 ----------");
        ejercicio3();
        System.out.println("\n----- EJERCICIO 4 ----------");
        ejercicio4();
        System.out.println("\n----- EJERCICIO 5 ----------");
        ejercicio5();
    }

}

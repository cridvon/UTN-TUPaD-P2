package tp3.introduccion_poo;

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private int capacidadMaxima = 100;
    private boolean enVuelo;
    private int distanciaRecorrida;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        if (combustible > capacidadMaxima) {
            this.combustible = capacidadMaxima;
        } else {
            this.combustible = combustible;
        }
        enVuelo = false;
        distanciaRecorrida = 0;
    }

    public void despegar() {
        if (!enVuelo) {
            if (combustible >= 10) {
                enVuelo = true;
                combustible -= 10;
                System.out.println(nombre + " a despegado!");
            } else {
                System.out.println("Combustible insuficiente (" + combustible + "/100). Favor de cargar.");
            }
        } else System.out.println(nombre + " ya se encuentra en vuelo!");
    }

    public void avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println(nombre + " aun no ha despegado. Es imposible avanzar.");
        } else {
            int gastoCombustible = distancia * 2;
            if (gastoCombustible > combustible) {
                System.out.println("Imposible avanzar " + distancia + "km. Combustible insuficiente("+combustible+"/100).");
            } else {
                System.out.println(nombre + " avanza " + distancia + "km.");
                combustible -= gastoCombustible;
                distanciaRecorrida += distancia;
            }
        }
    }

    public void recargarCompustible(int cantidad) {
        if (combustible + cantidad >= capacidadMaxima) {
            combustible = capacidadMaxima;
            System.out.println("Tanque lleno!");
        } else {
            combustible += cantidad;
            System.out.println("Combustible cargado. Actualmente hay " + combustible + "/100 en el tanque.");
        }
    }

    public void mostrarEstado() {
        String estadoActual;
        if (enVuelo) {
            estadoActual = "en vuelo";
        } else {
            estadoActual = "detenida";
        }
        System.out.println(nombre + " a recorrido " + distanciaRecorrida + "km. Actualmente se encuentra " + estadoActual + " y tiene " + combustible + "/100 de combustible.");
    }
}

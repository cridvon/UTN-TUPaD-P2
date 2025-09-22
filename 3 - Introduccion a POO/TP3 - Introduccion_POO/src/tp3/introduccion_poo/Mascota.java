
package tp3.introduccion_poo;

public class Mascota {

    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {

        System.out.println(nombre + " es " + especie + " y tiene " + edad + " años");
    }

    public void cumplirAnios() {
        edad += 1;
    }

}

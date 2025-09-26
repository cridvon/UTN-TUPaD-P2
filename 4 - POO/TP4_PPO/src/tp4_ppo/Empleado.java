package tp4_ppo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    
    private static List<Integer> listaIds = new ArrayList<>();
    private static int mayor = 0;

    private static final double SALARIO_DEFECTO = 200;

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = setId(id);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public Empleado(String nombre, String puesto) {
        this(crearNuevoId(), nombre, puesto, SALARIO_DEFECTO);
        
    }

    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;

    }

    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * porcentaje/100;
        this.salario += aumento;
    }

    private static int setId(int id) {
        boolean bandera = false;
        if (listaIds.contains(id)) {
            bandera = true;
        }

        if (bandera) {
            return crearNuevoId();
        } else {

            listaIds.add(id);
            return id;

        }
    }

    private static int crearNuevoId() {

        for (int elemento : listaIds) {
            if (elemento >= mayor) {
                mayor = elemento;
            }
        }

        mayor++;
        listaIds.add(mayor);
        return mayor;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    static void mostrarTotalEmpleados() {
        System.out.println("Total Empleados= " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre
                + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

}

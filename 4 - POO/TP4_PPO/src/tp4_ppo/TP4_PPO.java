/*
    PROGRAMACIÓN II
    Trabajo Práctico 4: Programación Orientada a Objetos II

    Alumno: Chiavón, Cristian
    Comisión: M2025-11
 */

package tp4_ppo;

public class TP4_PPO {

    public static void main(String[] args) {

        Empleado e1 = new Empleado(1, "Juan", "Operador", 400);
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Pablo", "Tecnico");
        System.out.println(e2);
       
        Empleado e3 = new Empleado(2, "Jorge", "Electricista", 100);
        System.out.println(e3);
        
        Empleado e4 = new Empleado("Ana", "RRHH");
        System.out.println(e4);
       
        Empleado e5 = new Empleado(2, "Eliseo", "Ingeniero", 200);
        System.out.println(e5);
        
        Empleado.mostrarTotalEmpleados();

        e2.actualizarSalario(25.0);
        e4.actualizarSalario(300);
      
        System.out.println("\nSe actualizan salarios de Id = " + e2.getId() +" e Id = " + e4.getId() + ".\n");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

    }

}

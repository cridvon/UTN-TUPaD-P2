/*
    PROGRAMACIÓN II
    Trabajo Práctico 2: Programación Estructurada

    Alumno: Chiavón, Cristian
    Comisión: M2025-11
 */
package programacion2;

import java.util.Scanner;

public class Programacion2 {
    
    
    // Estructuras Condicionales
    
    public static void ejercicio1(Scanner input){
        
        System.out.print("Ingrese un año: ");
        int ano = Integer.parseInt(input.nextLine());
        determinar_bisiesto(ano);
    
    }
    
    public static void determinar_bisiesto(int ano){
        
       
        if (ano%4 ==0 && ano%100 != 0){
            System.out.println("El año "+ano+" es bisiesto.");
        }else if (ano % 400 == 0){
                    System.out.println("El año "+ano+" es bisiesto.");
                    }
        else{
            System.out.println("El año "+ano+" no es bisiesto.");
        }
    }
    
    
    
    public static void ejercicio2(Scanner input){
        
        int num1, num2, num3, max;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if (num1 > num2){
            if (num1 > num3){
                max = num1;
            }else {
                max = num3;
            }    
        }else if (num2 > num3){
            max = num2;
        }else{
            max = num3;
        }
        
        System.out.println("El mayor es " + max);
    }
    
    public static void ejercicio3(Scanner input){
                

        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12){
            System.out.println("Eres un Niño");
        }else if (edad<17){
            System.out.println("Eres un Adolecente");
        }else if (edad <59){
                    System.out.println("Eres un Adulto");
        }else System.out.println("Eres un Adulto mayor");
        
    }
    
    public static void ejercicio4(Scanner input){
        
        System.out.println("## SE VA A SOLICITAR UN PRECIO DE PRODUCTO Y SU CATEGORIA ##");
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese su categoria (A, B o C): ");
        String categoria = input.nextLine();
        String categoriaMayus = categoria.toUpperCase();
        int descuento=0;
        double precioFinal;
        
        switch (categoriaMayus){
            case "A": descuento = 10; break;
            case "B": descuento = 15; break;
            case "C": descuento = 20; break;
        }
        precioFinal = precio - (precio*descuento/100);
        
        System.out.println("Precio original: $"+precio+"");        
        System.out.println("Descuento aplicado: "+descuento+"%");
        System.out.println("Precio final: $"+precioFinal);
        
    }
    
    
    // Estructuras De Repetición
    
    public static void ejercicio5(Scanner input){
        
        int numero=-1;
        int pares = 0;
        
        while (numero != 0){
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
            if (numero % 2 == 0){
            pares +=numero;
            }
        }
        
        System.out.println("La suma de los numeros pares es: "+pares);
    
    }
    
    public static void ejercicio6(Scanner input){
    
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        System.out.println("## DEBE INGRESAR 10 NUMEROS ##");
        for(int i=0; i<10; i++){
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            int numero = Integer.parseInt(input.nextLine());
            if (numero < 0) negativos += 1;
            if (numero > 0) positivos += 1;
            if (numero == 0) ceros += 1;
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
    public static void ejercicio7(Scanner input){
        
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10):");            
            nota = Integer.parseInt(input.nextLine());
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        
        } while (nota <0 || nota >10);
        
        System.out.println("Nota guardada correctamente");

    
    }
    
    // Funciones
    
    
    public static void ejercicio8(Scanner input){
    
        System.out.print("Ingrese el precio base del producto: ");    
        double precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");    
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");    
        double descuento = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final del producto es: "+ calcularPrecioFinal(impuesto,descuento,precioBase));
    }
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){
        double precioFinal = precioBase + (precioBase*impuesto/100) - (precioBase*descuento/100);
        return precioFinal;
    }
    
    
    // Ej9
    public static void ejercicio9(Scanner input){
    
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en Kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la letra correspondiente a la zona de envio: (N)acional o (I)nternacional: ");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
               
        calcularTotalCompra(precioProducto,costoEnvio);        
    }
    
    public static double calcularCostoEnvio(double peso, String zona){
       
       String zonaMayus = zona.toUpperCase();
       
       if (zonaMayus.equals("N")) return peso*5;
       else if (zonaMayus.equals("I")) return peso*10;   
       else return 0;
    }
    
    public static void calcularTotalCompra(double precioProducto, double costoEnvio){
        
        double PrecioFinal = precioProducto+costoEnvio; 
        System.out.println("El costo de envio es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + PrecioFinal);
    }
    
    
    
    // Ej10
    public static void ejercicio10(Scanner input){
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+nuevoStock);
    
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
    
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
    
        return nuevoStock;
    }
    
    
    // Ej 11
    final static double DESCUENTO = 0.10;
    
    public static void ejercicio11(Scanner input){
    
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio*DESCUENTO;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: $"+descuentoAplicado);
        System.out.println("El precio final con descuento es: $"+ precioFinal);
    }
    
    // Arrays y Recursividad
    
    public static void ejercicio12(Scanner input){
        
        double[] precios = {199.9,299.5,149.75,399,89.99};
        
        System.out.println("Precios Originales:");
        for (double precio : precios){
            System.out.println("Precio: $"+precio);
        }
        
        precios[2]=129.99;
        
        System.out.println("\nPrecios Modificados:");
        for (double precio : precios){
            System.out.println("Precio: $"+precio);
        }
    
    }
    
    
    public static void ejercicio13(Scanner input){
    
        double[] precios = {199.9,299.5,149.75,399,89.99};
        int longitud = precios.length;
       
        System.out.println("Precios Originales:");
        mostrarPrecios(precios,longitud);
        
        precios[2]=129.99;
        
        System.out.println("\nPrecios Modificados:");
        mostrarPrecios(precios,longitud);
        
    }
    
    public static void mostrarPrecios(double[] precios,int longitud){
    
        if (longitud-1 > 0) {
            mostrarPrecios(precios, longitud-1);
        }
        System.out.println("Precio: "+precios[longitud-1]);
    }
    
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("\n----- EJERCICIO 1 ----------");
        ejercicio1(input);
        System.out.println("\n----- EJERCICIO 2 ----------");
        ejercicio2(input);
        System.out.println("\n----- EJERCICIO 3 ----------");
        ejercicio3(input);
        System.out.println("\n----- EJERCICIO 4 ----------");
        ejercicio4(input);
        System.out.println("\n----- EJERCICIO 5 ----------");
        ejercicio5(input);
        System.out.println("\n----- EJERCICIO 6 ----------");
        ejercicio6(input);
        System.out.println("\n----- EJERCICIO 7 ----------");
        ejercicio7(input);
        System.out.println("\n----- EJERCICIO 8 ----------");
        ejercicio8(input);
        System.out.println("\n----- EJERCICIO 9 ----------");
        ejercicio9(input);
        System.out.println("\n----- EJERCICIO 10 ----------");
        ejercicio10(input);
        System.out.println("\n----- EJERCICIO 11 ----------");
        ejercicio11(input);
        System.out.println("\n----- EJERCICIO 12 ----------");
        ejercicio12(input);
        System.out.println("\n----- EJERCICIO 13 ----------");
        ejercicio13(input);  
    }
}

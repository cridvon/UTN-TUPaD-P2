
import java.util.Scanner;

/*
Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
 */
public class TP1_ej5 {

    
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner input = new Scanner(System.in);
                
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        
    }
    
}

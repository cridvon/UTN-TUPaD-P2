
import java.util.Scanner;

/*

1.	Manejar conversiones de tipo y división en Java.  
a.	Escribe un programa que divida dos números enteros ingresados por el usuario.  
b.	Modifica el código para usar double en lugar de int y compara los resultados. 

*/
public class TP1_ej8 {

    public static void main(String[] args) {
        
        //int num1, num2; //Aca se definieron como enteros.
        
        double num1, num2; //Aca se definen como double
        
        
        Scanner input = new Scanner(System.in);
                
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 / num2);
    }
    
}

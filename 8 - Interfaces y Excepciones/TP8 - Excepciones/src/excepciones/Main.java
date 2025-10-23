package excepciones;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 1. División segura ===");
        DivisionSegura.dividir();

        System.out.println("\n=== 2. Conversión de cadena a número ===");
        ConversionCadenaNumero.convertir();

        System.out.println("\n=== 3. Lectura de archivo ===");
        LecturaArchivo.leerArchivo("archivo.txt"); // cambiar la ruta según tu archivo

        System.out.println("\n=== 4. Verificación de edad ===");
        VerificacionEdad.verificarEdad();

        System.out.println("\n=== 5. Lectura con try-with-resources ===");
        LecturaConTryWithResources.leerArchivo("archivo.txt");
    }
}

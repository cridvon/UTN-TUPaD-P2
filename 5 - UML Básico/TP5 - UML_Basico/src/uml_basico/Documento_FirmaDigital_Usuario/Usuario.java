package uml_basico.Documento_FirmaDigital_Usuario;

public class Usuario {

    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getInfo() {
        return "{nombre= " + nombre + ", email= " + email + "}";
    }

}

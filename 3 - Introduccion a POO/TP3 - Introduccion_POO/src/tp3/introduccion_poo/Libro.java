package tp3.introduccion_poo;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
        }
    }

    public void setAnioPublicacion(int anio) {
        if (anio <= 2025 && anio > 0) {
            anioPublicacion = anio;
        } else {
            System.out.println("Esa fecha es incorrecta. El año debe ser positivo y menor o igual a 2025");
        }
    }
}

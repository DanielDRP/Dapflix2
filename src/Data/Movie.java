package Data;

public class Movie {
    private final String titulo;
    private final String clasificacion;
    private final String imagenUrl;

    public Movie(String titulo, String clasificacion, String imagenUrl) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.imagenUrl = imagenUrl;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
}
package Ejercicio7;

public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private String artista;
    private int duracionSegundos;

    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(Cancion c){
        int resultado = (this.artista).compareTo(c.getArtista());

        if (resultado != 0){
            return resultado;
        }

        return (this.titulo).compareTo(c.getTitulo());
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "artista='" + artista + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracionSegundos=" + duracionSegundos +
                '}';
    }
}

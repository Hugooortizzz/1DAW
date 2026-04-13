public class Pokemon implements Cloneable, Atacable{
    private String nombre;
    private Tipo tipo;
    private int nivel;
    private int puntosVida;

    public Pokemon(String nombre, Tipo tipo, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public void mostrarDatos() {
        System.out.print(
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida);
    }

    public void subirNivel(){
        System.out.println("¡"+this.nombre + " esta subiendo de nivel!");
        this.nivel ++;
        this.puntosVida += 10;
    }

    public void atacar(Pokemon rival){};

    @Override
    public Pokemon clone(){
        try{
            return (Pokemon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}

public class PokemonFuego extends Pokemon implements Atacable {
    private double temperaturaLlama;

    public PokemonFuego(String nombre, int nivel, int puntosVida, double temperaturaLlama) {
        Tipo tipo = Tipo.Fuego;
        super(nombre, tipo, nivel, puntosVida);
        this.temperaturaLlama = temperaturaLlama;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(", temperaturaLlama=" + temperaturaLlama);
    }

    @Override
    public void atacar(Pokemon rival){
        if (rival.getPuntosVida() > 0){
            System.out.println("¡" + this.getNombre() + " ataca a " + rival.getNombre() + " quitandole 15 puntos de vida");
            rival.setPuntosVida(rival.getPuntosVida() - 15);
        } else{
            System.out.println("¡" + this.getNombre() + " no puede atacar a " + rival.getNombre() + " ya que sus" +
                    " puntos de vida ya están a 0");
        }

    }

    @Override
    public PokemonFuego clone(){
        return (PokemonFuego) super.clone();
    }

    public double getTemperaturaLlama() {
        return temperaturaLlama;
    }

    public void setTemperaturaLlama(double temperaturaLlama) {
        this.temperaturaLlama = temperaturaLlama;
    }
}

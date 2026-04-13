public class PokemonAgua extends Pokemon implements Atacable, Cloneable{
    private double profundidadBuceo;

    public PokemonAgua(String nombre, int nivel, int puntosVida, double profundidadBuceo) {
        Tipo tipo = Tipo.Agua;
        super(nombre, tipo, nivel, puntosVida);
        this.profundidadBuceo = profundidadBuceo;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(", profundidadBuceo=" + profundidadBuceo);
    }

    @Override
    public void atacar(Pokemon rival){
        if (rival.getPuntosVida() > 0){
            System.out.println("¡" + this.getNombre() + " ataca a " + rival.getNombre() + " quitandole 12 puntos de vida");
            rival.setPuntosVida(rival.getPuntosVida() - 12);
        } else{
            System.out.println("¡" + this.getNombre() + " no puede atacar a " + rival.getNombre() + " ya que sus" +
                    " puntos de vida ya están a 0");
        }
    }

    @Override
    public PokemonAgua clone(){
        return (PokemonAgua) super.clone();
    }

    public double getProfundidadBuceo() {
        return profundidadBuceo;
    }

    public void setProfundidadBuceo(double profundidadBuceo) {
        this.profundidadBuceo = profundidadBuceo;
    }
}

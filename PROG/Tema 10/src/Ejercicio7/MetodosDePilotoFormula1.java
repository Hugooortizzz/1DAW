package Ejercicio7;

public interface MetodosDePilotoFormula1 {
    String getEscuderia();

    void setEscuderia(String escuderia);

    String getNombre();

    void setNombre(String nombre);

    public String getApellido();

    void setApellido(String apellido);

    String getNacionalidad();

    void setNacionalidad(String nacionalidad);

    int getTrofeosGanados();

    void setTrofeosGanados(int trofeosGanados);

    int getNumeroEnParrilla();

    void setNumeroEnParrilla(int numeroEnParrilla);

    int getEdad();

    void setEdad(int edad);

    int getTiempoEnF1();

    void setTiempoEnF1(int tiempoEnF1);

    int getTiempoEnEscuderia();

    void setTiempoEnEscuderia(int tiempoEnEscuderia);

    void celebracionTriunfo();

    void circuito(String nombCircuito);

    void adelanta(PilotoFormula1 piloto);

    void gana();

    void averia();

    int nuevoTrofeo();

    void nuevaEscuderia(String nuevaEscuderia);

}

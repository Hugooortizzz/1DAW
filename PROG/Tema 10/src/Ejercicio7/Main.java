package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        PilotoFormula1 hamilton = new PilotoFormula1("Ferrari", "Lewis", "Hamilton", "Inglés", 2, 3, 41, 19, 2);
        PilotoFormula1 vettel = new PilotoFormula1("Aston Martin", "Sebastian", "Vettel", "Alemán", 0, 1, 38, 15, 2);
        PilotoFormula1 alonso = new PilotoFormula1("Aston Martin", "Fernando", "Alonso", "Español", 0, 2,44,23, 4);

        hamilton.circuito("Nuburgring");
        hamilton.averia();
        alonso.adelanta(vettel);
        alonso.gana();
        alonso.celebracionTriunfo();
        alonso.nuevoTrofeo();
        hamilton.nuevaEscuderia("Mercedes");
        vettel.circuito("Brasil");
        vettel.adelanta(alonso);
        alonso.averia();
        hamilton.adelanta(vettel);
        hamilton.gana();
        hamilton.celebracionTriunfo();
        hamilton.getTrofeosGanados();
        alonso.nuevoTrofeo();
        alonso.getTrofeosGanados();



    }
}

public class PruebaTiendaInstrumentos {
    public static void main(String[] args) {
        Instrumento g1 = new Guitarra("G1", "Fender", 500, 2010, true, 6);
        Instrumento g2 = new Guitarra("G2", "Gibson", 700, 1995, false, 7);
        Instrumento g3 = new Guitarra("G3", "Yamaha", 300, 2005, false, 6);

        Instrumento p1 = new Piano("P1", "Yamaha", 2000, 1990, 88, true);
        Instrumento p2 = new Piano("P2", "Casio", 800, 2015, 61, false);
        Instrumento p3 = new Piano("P3", "Kawai", 1500, 1980, 70, false );

        TiendaInstrumentos tienda = new TiendaInstrumentos("Instrumentos Daniela");

        tienda.añadirInstrumento(g1);
        tienda.añadirInstrumento(g2);
        tienda.añadirInstrumento(g3);
        tienda.añadirInstrumento(p1);
        tienda.añadirInstrumento(p2);
        tienda.añadirInstrumento(p3);

        Instrumento[] catalogo = tienda.getCatalogo();

        for (int i = 0; i < 6; i++) {
            System.out.println(catalogo[i].toString());
        }

        tienda.rebajarEspeciales(10);




    }
}

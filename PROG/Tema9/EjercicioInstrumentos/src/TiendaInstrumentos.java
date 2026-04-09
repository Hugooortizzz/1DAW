public class TiendaInstrumentos {
    private String nombre;
    private Instrumento[] catalogo;
    private int numInstrumentos;
    private static int totalInstrumentosInsertados;
    private static int totalInstrumentosVendidos;
    private static int totalDescuentosAplicados;

    public TiendaInstrumentos(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Instrumento[12];
        this.numInstrumentos = 0;
    }

    public boolean añadirInstrumento(Instrumento i){
        if (this.numInstrumentos <= 12){
            this.catalogo[numInstrumentos] = i;
            this.numInstrumentos ++;
            totalInstrumentosInsertados ++;
            return true;
        }else{
            System.out.println("No hay hueco");
            return false;
        }
    }

    public Instrumento buscarPorCodigo(String codigo){
        for (int i = 0; i < this.numInstrumentos; i++) {
            if(catalogo[i].getCodigo() == codigo){
                return catalogo[i];
            }
        }

        return null;
    }

    public Instrumento instrumentoMasCaro(){
        Instrumento mascaro = catalogo[0];

        for (int i = 0; i < this.numInstrumentos; i++) {
            if (catalogo[i].calcularPrecioFinal() > mascaro.calcularPrecioFinal()){
                mascaro = catalogo[i];
            }
        }

        return mascaro;
    }

    public double precioMedioFinal(){
        double precioMedio = 0;

        for (int i = 0; i < this.numInstrumentos; i++) {
            precioMedio += catalogo[i].calcularPrecioFinal();
        }

        precioMedio /= this.numInstrumentos;

        return precioMedio;
    }

    public double valorTotalNoVendido(){
        double precioMedio = 0;
        int noVendidos = 0;

        for (int i = 0; i < this.numInstrumentos; i++) {
            if(!catalogo[i].estaVendido()){
                precioMedio += catalogo[i].calcularPrecioFinal();
                noVendidos ++;
            }

        }

        precioMedio /= noVendidos;

        return precioMedio;
    }

    public int contarVintage(){
        int contador = 0;

        for (int i = 0; i < numInstrumentos; i++) {
            if (catalogo[i].esVintage()){
                contador ++;
            }
        }

        return contador;
    }

    public int contarEspeciales(){
        int contador = 0;

        for (int i = 0; i < numInstrumentos; i++) {
            if (catalogo[i].esEspecial()){
                contador ++;
            }
        }

        return contador;
    }

    public boolean venderInstrumento(String codigo){
        if (this.buscarPorCodigo(codigo) != null){
            if (!this.buscarPorCodigo(codigo).estaVendido()){
                this.buscarPorCodigo(codigo).setVendido(true);
                totalInstrumentosVendidos ++;
                return true;
            }
        }

        return false;
    }

    public int rebajarEspeciales(double porcentaje){
        porcentaje /= 100;
        porcentaje ++;

        int contador = 0;

        for (int i = 0; i < numInstrumentos; i++) {
            if(catalogo[i].esEspecial()){
                catalogo[i].setPrecioBase(catalogo[i].getPrecioBase() * porcentaje);
                contador ++;
                totalDescuentosAplicados ++;
            }
        }

        return contador;
    }

    public Instrumento primerInstrumentoDeTipo(String tipo){
        for (int i = 0; i < numInstrumentos; i++) {
            if(catalogo[i].getTipo() == tipo){
                return catalogo[i];
            }
        }

        return null;
    }

    public Instrumento[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Instrumento[] catalogo) {
        this.catalogo = catalogo;
    }
}
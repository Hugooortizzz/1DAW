package Ejercicio9;

public class Television extends Electrodomestico{
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;
    private static double precioTelevisiones = 0;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, Color color, Letra consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();

        if (this.resolucion > 40){
            this.setPrecioBase(this.getPrecioBase() * 1.40);
        }

        if (this.sintonizadorTDT){
            this.setPrecioBase(this.getPrecioBase() + 50);
        }

        precioTelevisiones += this.getPrecioBase();
        Electrodomestico.setPrecioElectrodomesticos(Electrodomestico.getPrecioElectrodomesticos() + this.getPrecioBase());
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public static double getPrecioTelevisiones() {
        return precioTelevisiones;
    }
}

package Ejercicio9;

public class Lavadora extends Electrodomestico{
    private double carga = 5;
    private static double precioLavadoras = 0;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, Color color, Letra consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();

        if (this.carga > 30){
            this.setPrecioBase(this.getPrecioBase() + 50);
        }

        precioLavadoras += this.getPrecioBase();
        Electrodomestico.setPrecioElectrodomesticos(Electrodomestico.getPrecioElectrodomesticos() + this.getPrecioBase());
    }

    public double getCarga() {
        return carga;
    }

    public static double getPrecioLavadoras() {
        return precioLavadoras;
    }
}

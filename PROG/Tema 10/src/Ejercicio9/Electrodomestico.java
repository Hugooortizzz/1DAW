package Ejercicio9;

public class Electrodomestico {
    private double precioBase = 100;
    private Color color = Color.blanco;
    private Letra consumoEnergetico = Letra.F;
    private double peso = 5;
    private static double precioElectrodomesticos = 0;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, Color color, Letra consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //Que compruebe si es una letra entre A y F?
    //No es necesario si ya lo he hecho con un enum
    //public void comprobarConsumoEnergetico(char letra){
    //}

    //public void comprobarColor(String color){
    //}

    public void precioFinal(){
        switch(this.consumoEnergetico){
            case A:
                this.precioBase += 100;
                break;
            case B:
                this.precioBase += 80;
                break;
            case C:
                this.precioBase += 60;
                break;
            case D:
                this.precioBase += 50;
                break;
            case E:
                this.precioBase += 30;
                break;
            case F:
                this.precioBase += 10;
                break;
        }

        if(this.peso <= 19){
            this.precioBase += 10;
        }else if(this.peso <= 49){
            this.precioBase += 50;
        }else if(this.peso <= 79){
            this.precioBase += 80;
        }else{
            this.precioBase += 100;
        }

        Electrodomestico.setPrecioElectrodomesticos(Electrodomestico.getPrecioElectrodomesticos() + this.getPrecioBase());
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public Letra getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setConsumoEnergetico(Letra consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static double getPrecioElectrodomesticos() {
        return precioElectrodomesticos;
    }

    public static void setPrecioElectrodomesticos(double precioElectrodomesticos) {
        Electrodomestico.precioElectrodomesticos = precioElectrodomesticos;
    }
}

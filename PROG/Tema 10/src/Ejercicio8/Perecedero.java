package Ejercicio8;

public class Perecedero extends Producto{
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcular(int n_productos){
        double calculo = super.calcular(n_productos);

        if (this.diasACaducar <= 3 || this.diasACaducar >= 1){
            calculo /= (n_productos - this.diasACaducar);
        }

        return calculo;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Perecedero{" +
                "diasACaducar=" + diasACaducar +
                '}';
    }
}

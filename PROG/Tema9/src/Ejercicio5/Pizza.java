package Ejercicio5;

public class Pizza {
    private static int pizzasPedidas;
    private static int pizzasServidas;
    private Tipo tipo;
    private Tamaño tamaño;
    private Estado estado;

    public Pizza(Tipo tipo, Tamaño tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = Estado.Pedida;
        this.pizzasPedidas ++;
    }

    public void servirPizza(){
        if (this.estado == Estado.Servida){
            System.out.println("Está pizza ya se ha servido");
        }else{
            this.estado = Estado.Servida;
            this.pizzasServidas ++;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static int getPizzasPedidas() {
        return pizzasPedidas;
    }

    public static void setPizzasPedidas(int pizzasPedidas) {
        Pizza.pizzasPedidas = pizzasPedidas;
    }

    public static int getPizzasServidas() {
        return pizzasServidas;
    }

    public static void setPizzasServidas(int pizzasServidas) {
        Pizza.pizzasServidas = pizzasServidas;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pizza " +
                tipo + " " +
                tamaño + ", " +
                estado;
    }
}

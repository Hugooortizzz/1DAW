public class Direccion implements Cloneable{
    String ciudad;
    Direccion(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public Direccion clone() {
        try {
            return (Direccion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }


}
